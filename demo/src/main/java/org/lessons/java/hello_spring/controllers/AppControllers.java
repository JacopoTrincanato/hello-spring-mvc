package org.lessons.java.hello_spring.controllers;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class AppControllers {

    @GetMapping("/")
    public String homepage(Model model) {
        // aggiungo l'attributo a model
        model.addAttribute("currentYear", LocalDate.now().getYear());
        return "homepage";
    }
}
