package com.project.usingthespringwebscopes.ch9.ex3.controllers;

import com.project.usingthespringwebscopes.ch9.ex3.LoginProcessor3;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController3 {
    private final LoginProcessor3 loginProcessor3;
    public LoginController3(LoginProcessor3 loginProcessor3) {
        this.loginProcessor3 = loginProcessor3;
    }
    @GetMapping("/ex3")
    public String loginGet() {
        return "login3.html";
    }

    @PostMapping("/ex3")
    public String loginPost(@RequestParam String username, @RequestParam String password, Model model) {
        loginProcessor3.setUsername(username);
        loginProcessor3.setPassword(password);
        boolean loggedIn = loginProcessor3.login();
        if (loggedIn) {
            return "redirect:/mainEx3";
        } else {
            model.addAttribute("message", "Login failed.");
        }
        return "login3.html";
    }
}
