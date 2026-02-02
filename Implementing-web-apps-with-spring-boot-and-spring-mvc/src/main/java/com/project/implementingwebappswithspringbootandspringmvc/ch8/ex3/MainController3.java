package com.project.implementingwebappswithspringbootandspringmvc.ch8.ex3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController3 {
    @RequestMapping("/home3")
    public String home(@RequestParam(required = false) String color, Model model,
                       @RequestParam(required = false) String username) {
        model.addAttribute("username", username);
        model.addAttribute("color", color);
        return "home.html";
    }
}
