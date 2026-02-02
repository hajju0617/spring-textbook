package com.project.implementingwebappswithspringbootandspringmvc.ch8.ex4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController4 {
    @RequestMapping("/home4/{color}")
    public String home(@PathVariable String color, Model model) {
        model.addAttribute("username", "홍길동");
        model.addAttribute("color", color);
        return "home.html";
    }
}
