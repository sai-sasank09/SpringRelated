package com.sasank;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
//    Laptop(){
//        System.out.println("Laptop obj Created");
//    }

    public void compile(){
        System.out.println("compiling using laptop..");
    }
}
