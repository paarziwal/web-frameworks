package com.example.springapp.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Value("${name}")
    private String name;

    @GetMapping("/name")
    public String getName() {
        return name;
    }
}