package com.renarcus.businessgear.controller;

import com.renarcus.businessgear.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by troley on 11-5-17.
 */
@Controller
public class CustomerController {

    @GetMapping("/interested")
    public String interested(Model model) {
        model.addAttribute("command", new Customer());
        return "/customer/interested";
    }

    @PostMapping("/registration")
    public String customerRegistration(@ModelAttribute Customer customer, BindingResult result) {
        return null;
    }
}
