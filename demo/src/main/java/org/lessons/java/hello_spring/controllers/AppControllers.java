package org.lessons.java.hello_spring.controllers;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")

public class AppControllers {

    @GetMapping("/")
    public String homepage(Model model) {
        // aggiungo l'attributo a model
        model.addAttribute("currentYear", LocalDate.now().getYear());
        return "homepage";
    }

    @GetMapping("/info")
    public String companyInfo(@RequestParam(name = "name") String name, Model model) {
        // aggiungo gli attributi a model
        model.addAttribute("name", name);
        model.addAttribute("phoneNumber", "+39 123 45 67 890");
        model.addAttribute("email", name + "@gmail.com");
        return "companyInfo";
    }
}
