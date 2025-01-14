package com.sasank.SpringDemo1.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements  Computer{


    public void compile(){
        System.out.print("Compiling in ");

    }
}
