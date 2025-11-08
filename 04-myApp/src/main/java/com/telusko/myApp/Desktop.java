package com.telusko.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer
{
    public void compile()
    {
        System.out.println("compilando con 404 bugs pero mas rapido PC");
    }
}
