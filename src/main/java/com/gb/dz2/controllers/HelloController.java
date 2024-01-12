package com.gb.dz2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

    @PostMapping("/login")
    public String hello(String user, Model model){
        model.addAttribute("user", user);
        return "hello";
    }
}
