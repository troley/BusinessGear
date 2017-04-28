package com.renarcus.businessgear.controller;

import com.renarcus.businessgear.exception.BadRequestException;
import com.renarcus.businessgear.exception.ResourceNotFoundException;
import com.renarcus.businessgear.model.Category;
import com.renarcus.businessgear.model.Product;
import com.renarcus.businessgear.model.PropertyEditor.CategoryPropertyEditor;
import com.renarcus.businessgear.service.category.CategoryService;
import com.renarcus.businessgear.service.product.ProductService;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Troley on 20-4-2017
 */
@Controller
@RequestMapping("/crud/products")
public class ProductCrudController {

    private static final Logger log = LoggerFactory.logger(ProductCrudController.class);

    private CategoryService categoryService;
    private ProductService productService;

    @Autowired
    private HttpSession session;

    @Autowired
    public ProductCrudController(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleResourceNotFoundException() {
        return "redirect:error/notfound";
    }

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleBadRequestExpception() {
        return "redirect:error/badrequest";
    }

    @GetMapping()
    public String productsCrudPage() {
        session.setMaxInactiveInterval(60 * 5); // set a 5 minutes session for logged in admin
        return "crud/product/products";
    }

    @GetMapping("/create")
    public String productCreationPage(Model model) {
        session.setMaxInactiveInterval(60 * 5);
        List<Category> categories = categoryService.getAllItems();
        model.addAttribute("command", new Product());
        model.addAttribute("categories", categories);
        return "crud/product/create";
    }

    // Register the PropertyEditor so that for example BindingResult
    // knows which properties belong to which models, else BindingResult
    // keeps throwing errors because of null properties.
    @InitBinder
    public void initBinderAll(WebDataBinder binder) {
        binder.registerCustomEditor(Category.class, new CategoryPropertyEditor());
    }

    @PostMapping("/create")
    public String productCreation(@ModelAttribute("command") Product product, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            log.error("Product not created. Returning back to product create page.");
            return "redirect:/crud/products/create";
        }

        productService.addItem(product);

        log.info("Product created. Redirecting to products overview.");
        return "redirect:/crud/products";
    }

    @GetMapping("/details/{id}")
    public String showProductDetails(@PathVariable Integer id, Model model) {

        if (id == null)
            throw new ResourceNotFoundException();

        Product product = productService.getItemById(id);

        if (product == null)
            throw new ResourceNotFoundException();

        session.setMaxInactiveInterval(60 * 5);
        List<Category> categories = categoryService.getAllItems();

        model.addAttribute("categories", categories);
        model.addAttribute("command", product);

        return "crud/product/detail";
    }

    @PostMapping("/details/update")
    public String updateProductDetails(@ModelAttribute Product product, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            log.error("Error occurred while updating product.");
            throw new BadRequestException();
        }

        productService.updateItem(product);
        return "redirect:/crud/products";
    }
}