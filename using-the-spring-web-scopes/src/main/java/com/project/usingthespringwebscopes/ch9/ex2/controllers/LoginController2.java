package com.project.usingthespringwebscopes.ch9.ex2.controllers;

import com.project.usingthespringwebscopes.ch9.ex2.LoginProcessor2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController2 {
    private final LoginProcessor2 loginProcessor2;
    public LoginController2(LoginProcessor2 loginProcessor2) {
        this.loginProcessor2 = loginProcessor2;
    }
    @GetMapping("/ex2")
    public String loginGet() {
        return "login2.html";
    }

    @PostMapping("/ex2")
    public String loginPost(@RequestParam String username, @RequestParam String password, Model model) {
        loginProcessor2.setUsername(username);
        loginProcessor2.setPassword(password);
        boolean loggedIn = loginProcessor2.login();
        if (loggedIn) {
            return "redirect:/mainEx2";
        } else {
            model.addAttribute("message", "Login failed.");
        }
        return "login2.html";
    }
}
