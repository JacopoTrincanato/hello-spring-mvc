package org.lessons.java.hello_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class AppControllers {

    @GetMapping("/")
    public String homepage() {

        return "homepage";
    }
}
