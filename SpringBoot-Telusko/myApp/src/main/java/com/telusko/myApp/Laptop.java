package com.telusko.myApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile()
    {
        System.out.println("compilando con 404 bugs");
    }
}
