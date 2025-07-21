package com.maxter.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @RequestMapping("/")
    public String greet()
    {
        System.out.println("AQUI ESTOY!");
        return "buenvenido a telusko";
    }

    @RequestMapping("/about")
    public String about()
    {
        return "no enseñamos, educamos";
    }
}
