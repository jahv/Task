package com.nearsoft.skytouch.pm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    private String message = "Hello World!";

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", message);
        return "index";
    }

}
