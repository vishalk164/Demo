package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/new")
    public String home() {
        return "Application is running successfull";
        
    }
    
    @GetMapping("/new/new")
    public String home1() {
        return "Application is running successfull";
        
    }
    @GetMapping("/new/n")
    public String home2() {
        return "Application is running successfull";
        
    }
}
