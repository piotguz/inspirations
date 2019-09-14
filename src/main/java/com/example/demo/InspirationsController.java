package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InspirationsController {
    @RequestMapping("/ping")
    public boolean ping() {
        return true;
    }
}
