package com.trial.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Hello Guest";
    }

    @RequestMapping("/about")
    public String about(){
        return "About us PAge";
    }
}
