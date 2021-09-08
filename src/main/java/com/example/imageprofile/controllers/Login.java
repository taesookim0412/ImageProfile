package com.example.imageprofile.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {
    @GetMapping("/aa")
    public String home(){
        return "aa";
    }
}
