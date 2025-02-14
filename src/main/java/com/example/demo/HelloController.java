package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String home() {
        return "Application is running";
    }
    
    @GetMapping("new")
    public String home2() {
    	return "Application is runnning on another path";
    }
    
    @GetMapping("new1")
    public String home3() {
    	return "Application is runnning on another Path 2";
    	
    }
}
