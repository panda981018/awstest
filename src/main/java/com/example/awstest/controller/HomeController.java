package com.example.awstest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @GetMapping("/test")
    public String helloWorld() {
        log.info("[HomeController] >>>>> run helloWorld");
        return "Hello World!";
    }
}
