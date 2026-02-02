package com.project.implementingwebappswithspringbootandspringmvc.ch8.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("username", "홍길동");
        model.addAttribute("color", "red");
        return "home.html";
    }
}
