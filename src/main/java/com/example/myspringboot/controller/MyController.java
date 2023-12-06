package com.example.myspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/api/v1/test")
    public String testMethod1() {
        try {
            return "1234";
        } catch (Exception e) {
            throw e;
        }
    }
}
