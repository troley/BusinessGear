package com.renarcus.businessgear.rest.controller;

import com.renarcus.businessgear.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Troley on 10-4-2017
 */
@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService productService;

    @Autowired
    @Qualifier("productService")
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String getAllProducts() {
        return productService.listProducts().toString();
    }

    @GetMapping("/products/{id}")
    public String getProductById(@PathVariable int id) {
        return productService.getProductById(id).toString();
    }

    @GetMapping("/products_category/{id}")
    public String getProductByCategory(@PathVariable int id) {
        return productService.getProductsByCategoryId(id).toString();
    }
}
