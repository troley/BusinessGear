package com.renarcus.businessgear.controller;

import com.renarcus.businessgear.model.Admin;
import com.renarcus.businessgear.model.Category;
import com.renarcus.businessgear.model.Product;
import com.renarcus.businessgear.service.category.CategoryService;
import com.renarcus.businessgear.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Troley on 20-4-2017
 */
@Controller
@RequestMapping("/crud/products")
public class ProductCrudController {

    private CategoryService categoryService;

    @Autowired
    public ProductCrudController(CategoryService categoryService) {
        this.categoryService = categoryService;
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

    @PostMapping("/create")
    public String productCreation(Model model) {
        // TODO: implement posting new product to DB
        return "crud/product/create";
    }
}