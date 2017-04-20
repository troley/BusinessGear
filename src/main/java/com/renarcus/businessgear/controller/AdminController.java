package com.renarcus.businessgear.controller;

import com.renarcus.businessgear.model.Admin;
import com.renarcus.businessgear.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping()
    public ModelAndView getAdminLoginPage() {
        return new ModelAndView("admin/admin", "command", new Admin());
    }

    @PostMapping("/login")
    public String getIt(@ModelAttribute("admin") Admin admin) {
        Admin verifiableAdmin = adminService.getItemById(admin.getUsername());

        if (verifiableAdmin != null) {
            if (verifiableAdmin.getPassword().equals(admin.getPassword())) {
                // redirect to CRUD view
                return "redirect:/crud/products";
            }
        }

        return null;
    }
}
