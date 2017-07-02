package com.renarcus.businessgear.controller;

import com.renarcus.businessgear.model.Customer;
import com.renarcus.businessgear.model.Product;
import com.renarcus.businessgear.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by troley on 11-5-17.
 */
@Controller
public class CustomerController {

    private ProductService productService;

    @Autowired
    public CustomerController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/interested")
    public String interested(Model model) {
        List<Product> products = productService.getAllItems();
        model.addAttribute("products", products);
        model.addAttribute("command", new Customer());
        return "/customer/interested";
    }
/*
    @PostMapping("/registration")
    public String customerRegistration(@ModelAttribute Customer customer, BindingResult result) {
        // testing customer registration in
        // com.renarcus.businessgear.rest.controller.RestCustomerController
        // method /interested
        return null;
    }
*/
}
