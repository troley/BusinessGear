package com.renarcus.businessgear.controller;

import com.renarcus.businessgear.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Troley on 10-4-2017
 */
@Controller
@RequestMapping("/products")
public class CollectionController {


    @GetMapping("/collection")
    public String getCollection() {
        return "collection";
    }

    @GetMapping("/detail/{productId}")
    public ModelAndView getProductDetails(@PathVariable int productId) {
        RestTemplate restTemplate = new RestTemplate();
        String productRestUrl = "http://localhost:8080/api/products/{productId}";
        String categoryRestUrl = "http://localhost:8080/api/category/";
        Product product = restTemplate.getForObject(productRestUrl, Product.class, productId);
        categoryRestUrl += product.getCategory().getId();

        Map<String, Object> models = new HashMap<String, Object>();
        models.put("product", product);

        return new ModelAndView("detail", models);

    }

}
