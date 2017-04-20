package com.renarcus.businessgear.rest.controller;

import com.renarcus.businessgear.model.Product;
import com.renarcus.businessgear.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/products")
@RequestMapping("/api/products")
public class RestProductController {

    private ProductService productService;

    @Autowired
    @Qualifier(value = "productService")
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllItems();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getItemById(id);
    }

    @GetMapping("/category/{id}")
    public List<Product> getProductByCategory(@PathVariable int id) {
        return productService.getItemsByCategoryId(id);
    }
}
