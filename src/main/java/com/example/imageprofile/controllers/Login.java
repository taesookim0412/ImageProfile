package com.example.imageprofile.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Login {
    @GetMapping("/aa")
    public String home(){
        return "aa";
    }

    @PostMapping("/login/login_action")
    public boolean loginAction(){
        System.out.println("Login action");
        return true;
    }
}
