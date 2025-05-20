package com.example.demo.controller;


import org.springframework.stereotype.Controller;

@Controller
public class HomeController {


    public String HomePage(){
        return "index";
    }
}
