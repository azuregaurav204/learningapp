package com.gaurav.azure.learningapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    String test() {
        return "Hi Gaurav";
    }
    @GetMapping("/hello")
    String hello() {
        return "<h1>Hello Richu My Lady</h1>";
    }
}
