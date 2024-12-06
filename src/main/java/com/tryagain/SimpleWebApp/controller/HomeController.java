package com.tryagain.SimpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return  "Welcome Rafhael";
    }

    @RequestMapping("/about")
    public String about() {
        return  "This is about page";
    }
}
