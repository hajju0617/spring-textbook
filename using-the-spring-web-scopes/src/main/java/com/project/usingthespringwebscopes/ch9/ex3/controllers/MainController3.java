package com.project.usingthespringwebscopes.ch9.ex3.controllers;

import com.project.usingthespringwebscopes.ch9.ex3.service.LoggedUserManagementService3;
import com.project.usingthespringwebscopes.ch9.ex3.service.LoginCountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController3 {
    private final LoggedUserManagementService3 loggedUserManagementService3;
    private final LoginCountService loginCountService;

    public MainController3(LoggedUserManagementService3 loggedUserManagementService3,
                           LoginCountService loginCountService) {
        this.loggedUserManagementService3 = loggedUserManagementService3;
        this.loginCountService = loginCountService;
    }

    @GetMapping("/mainEx3")
    public String home(@RequestParam(required = false) String logout, Model model) {
        if (logout != null) {
            loggedUserManagementService3.setUsername(null);
        }
        String username = loggedUserManagementService3.getUsername();
        int count = loginCountService.getCount();
        if (username == null) {
            return "redirect:/ex3";
        }
        model.addAttribute("username", username);
        model.addAttribute("loginCount", count);
        return "main3.html";
    }
}
