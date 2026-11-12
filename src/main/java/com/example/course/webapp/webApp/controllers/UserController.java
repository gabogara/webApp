package com.example.course.webapp.webApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hello World from Spring Boot");
        model.addAttribute("firstName", "Gabriel");
        model.addAttribute("lastName", "Restrepo");

        return "details";
    }
}