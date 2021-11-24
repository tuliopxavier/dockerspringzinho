package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioCotroller {

    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello World";
    }

}
