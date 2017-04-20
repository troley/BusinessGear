package com.renarcus.businessgear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Troley on 20-4-2017
 */
@Controller
@RequestMapping("/crud/products")
public class ProductCrudController {

    @RequestMapping()
    public String productsCrudPage() {
        return "crud/product/products";
    }
}