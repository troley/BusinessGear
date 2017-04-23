package com.renarcus.businessgear.controller;

import com.renarcus.businessgear.exception.PageNotFoundException;
import com.renarcus.businessgear.exception.ProductNotFoundException;
import com.renarcus.businessgear.model.Category;
import com.renarcus.businessgear.model.Product;
import com.renarcus.businessgear.model.PropertyEditor.CategoryPropertyEditor;
import com.renarcus.businessgear.service.category.CategoryService;
import com.renarcus.businessgear.service.product.ProductService;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public ProductCrudController(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }

    @GetMapping()
    public String productsCrudPage() {
        return "crud/product/products";
    }

    @GetMapping("/create")
    public String productCreationPage(Model model) {
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
            throw new PageNotFoundException();

        Product product = productService.getItemById(id);

        if (product == null)
            throw new ProductNotFoundException();

        Category category = categoryService.getItemById(product.getCategory().getId());

        model.addAttribute("category", category);
        model.addAttribute("command", product);

        return "crud/product/detail";
    }

    @PostMapping("/details/update")
    public String updateProductDetails(@ModelAttribute Product product, BindingResult bindingResult) {
        // TODO: Implement updating of a product.
        return null;
    }
}