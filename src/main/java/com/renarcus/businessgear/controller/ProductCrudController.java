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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Troley on 20-4-2017
 */
@Controller
@RequestMapping("/crud/products")
public class ProductCrudController {

    private static final Logger LOG = LoggerFactory.logger(ProductCrudController.class);
    private final String CRUD_OVERVIEW_PAGE = "redirect:/crud/products";
    private final int FIVE_MIN_SESSION = 60 * 5;

    private CategoryService categoryService;
    private ProductService productService;

    private HttpSession session;

    @Autowired
    public ProductCrudController(CategoryService categoryService, ProductService productService, HttpSession session) {
        this.categoryService = categoryService;
        this.productService = productService;
        this.session = session;
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleResourceNotFoundException() {
        return "redirect:error/notfound";
    }

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleBadRequestException() {
        return "redirect:error/badrequest";
    }

    @GetMapping()
    public String productsCrudMainPage(HttpServletRequest req) {
        session = req.getSession();
        session.setMaxInactiveInterval(FIVE_MIN_SESSION); // set a 5 minutes session for logged in admin
        return "crud/product/products";
    }

    @GetMapping("/create")
    public String productCreationPage(HttpServletRequest req, Model model) {
        session = req.getSession();
        session.setMaxInactiveInterval(FIVE_MIN_SESSION);
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
            LOG.error("Product not created. Returning back to product create page.");
            return "redirect:/crud/products/create";
        }

        productService.addItem(product);

        LOG.info("Product created. Redirecting to products overview.");
        return CRUD_OVERVIEW_PAGE;
    }

    @GetMapping("/details/{id}")
    public String showProductDetails(@PathVariable Integer id, HttpServletRequest req, Model model) {

        if (id == null)
            throw new ResourceNotFoundException();

        Product product = productService.getItemById(id);

        if (product == null)
            throw new ResourceNotFoundException();

        session = req.getSession();
        session.setMaxInactiveInterval(FIVE_MIN_SESSION);
        List<Category> categories = categoryService.getAllItems();

        model.addAttribute("categories", categories);
        model.addAttribute("command", product);

        return "crud/product/detail";
    }

    @PostMapping("/details/update")
    public String updateProductDetails(@ModelAttribute Product product, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            LOG.error("Error occurred while updating product.");
            throw new BadRequestException();
        }

        productService.updateItem(product);
        return CRUD_OVERVIEW_PAGE;
    }

    @GetMapping("/delete/{id}")
    public String removeProductPage(@PathVariable Integer id, Model model) {
        if (id == null)
            throw new ResourceNotFoundException();

        Product product = productService.getItemById(id);

        if (product == null)
            throw new ResourceNotFoundException();

        session.setMaxInactiveInterval(FIVE_MIN_SESSION);

        model.addAttribute("command", product);

        return "crud/product/delete";
    }

    @PostMapping("/delete/{id}")
    public String removeProduct(@PathVariable int id) {
        productService.removeItem(id);
        return CRUD_OVERVIEW_PAGE;
    }
}