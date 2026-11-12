package com.example.course.webapp.webApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hello World from Spring Boot");
        model.addAttribute("firstName", "Gabriel");
        model.addAttribute("lastName", "Restrepo");

        return "details";
    }

    @GetMapping("/details-custom")
    public String getMethodName(
        @RequestParam(defaultValue = "User Details") String title,
        @RequestParam(defaultValue = "Gabriel") String firstName,
        @RequestParam(defaultValue = "Restrepo") String lastName,
        Model model ) {

        model.addAttribute("title", title);
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);

        return "details";
    }
    
}