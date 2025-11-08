package org.telusko;

public class Laptop implements Computer {
    public Laptop()
    {
        System.out.println("Contructor de laptop");
    }

    public void compile()
    {
        System.out.println("Compiling en laptop");
    }
}
