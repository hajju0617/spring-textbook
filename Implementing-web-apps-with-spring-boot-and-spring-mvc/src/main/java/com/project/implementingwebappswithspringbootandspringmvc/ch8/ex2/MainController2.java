package com.project.implementingwebappswithspringbootandspringmvc.ch8.ex2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController2 {
    @RequestMapping("/home2")
    public String home(@RequestParam String color, Model model) {
        model.addAttribute("username", "홍길동");
        model.addAttribute("color", color);
        return "home.html";
    }
}
