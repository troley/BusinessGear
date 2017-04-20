package com.renarcus.businessgear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Troley on 9-4-2017
 */
@Controller
@RequestMapping({"/", "/home"})
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home() {
        return "redirect:/resources/html/index.html";
    }
}
