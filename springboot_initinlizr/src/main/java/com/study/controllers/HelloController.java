package com.study.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/ini")
    public String sayHi(){
        return "Hello Springboot!! hi";

    }

}
