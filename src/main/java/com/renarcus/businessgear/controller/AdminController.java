package com.renarcus.businessgear.controller;

import com.renarcus.businessgear.model.Admin;
import com.renarcus.businessgear.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private AdminService adminService;
    private PasswordEncoder encoder;

    @Autowired
    public AdminController(AdminService adminService, PasswordEncoder encoder) {
        this.adminService = adminService;
        this.encoder = encoder;
    }

    @GetMapping()
    public ModelAndView getAdminLoginPage() {
        return new ModelAndView("admin/login", "command", new Admin());
    }
/* posting to /login in login.jsp because of spring-security

    @PostMapping("/login")
    public String getIt(@ModelAttribute("admin") Admin admin, HttpServletRequest request) {
        Admin verifiableAdmin = adminService.getItemById(admin.getUsername());

        if (verifiableAdmin != null) {
            if (encoder.matches(admin.getPassword(), verifiableAdmin.getPassword())) {
                // redirect to CRUD view
                return "redirect:/crud/products";
            }
        }

        return "redirect:/admin";
    }
*/
    @GetMapping("/register")
    public ModelAndView registerAdmin() {
        return new ModelAndView("admin/register", "command", new Admin());
    }

    @PostMapping("/register")
    public String postRegisterAdmin(@Valid @ModelAttribute("admin") Admin admin,
                                    @RequestParam("repassword") String repassword, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/admin/register";
        }

        if (admin.getPassword().equals(repassword)) {
            try {
                admin.setPassword(encoder.encode(admin.getPassword()));
                adminService.addItem(admin);
            } catch (DataIntegrityViolationException e) {
                e.printStackTrace();
                return "redirect:/admin/admin_exists";
            }
            return "admin/register_successful";
        }
        return "redirect:/admin/register";
    }

    @GetMapping("/admin_exists")
    public String adminAlreadyExists() {
        return "/admin/admin_exists";
    }
}
