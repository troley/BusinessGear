package com.renarcus.businessgear.controller;

import com.renarcus.businessgear.misc.JsonParser;
import com.renarcus.businessgear.model.Product;
import com.renarcus.businessgear.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView getProductDetails(@PathVariable Integer productId) {
        if (productId != 0) {
            RestTemplate restTemplate = new RestTemplate();
            String url = "http://localhost:8080/api/products/{productId}";
            Product product = restTemplate.getForObject(url, Product.class, productId);
            return new ModelAndView("detail", "product", product);
        } else {
            return new ModelAndView("collection");
        }
    }

}
