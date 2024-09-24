package com.example.helloactions.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class Controller {
    @GetMapping("/welcome")
    public String getStringWelcome(@PathVariable String welcome, Model model){
        return "welcome"; //placeholder name maybe?
    }
}