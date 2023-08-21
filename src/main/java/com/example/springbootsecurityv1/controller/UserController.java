package com.example.springbootsecurityv1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("/admin_page")
    public String admin(){
        return "hello world from ADMIN PAGE";
    }

    @GetMapping("/user_page")
    public String user(){
        return "hello world from USER PAGE";
    }
}
