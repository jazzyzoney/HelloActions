package com.example.helloactions.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class WelcomeController {
    @GetMapping("/welcome") {
        public String welcome() {
            return "welcome";
        }
    }
}