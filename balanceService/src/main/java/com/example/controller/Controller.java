package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/health")
    public String health() {
        return "{\"status\": \"OK\"}";
    }
}
