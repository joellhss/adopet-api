package com.joel.adopet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public String welcome() {
        return "<h1>Bem-vindo à Adopet API.</h1>";
    }
}
