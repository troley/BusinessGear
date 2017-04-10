package com.renarcus.businessgear.controller;

import com.renarcus.businessgear.model.Product;
import com.renarcus.businessgear.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Troley on 10-4-2017
 */
@Controller
@RequestMapping("/products")
public class CollectionController {

    private ProductService productService;

    @Autowired
    @Qualifier(value = "productService")
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/collection")
    public String getCollection() {
        return "collection";
    }

    @GetMapping("/detail/{productId}")
    public ModelAndView getProductDetails(ModelMap model, @PathVariable Integer productId) {
        if (productId != null) {
            Product product = productService.getProductById(productId);
            model.addAttribute("product", product);
            return new ModelAndView("detail", model);
        } else {
            return new ModelAndView("collection", null);
        }
    }

}
