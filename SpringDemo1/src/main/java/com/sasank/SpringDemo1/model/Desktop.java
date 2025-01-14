package com.sasank.SpringDemo1.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    @Autowired

    public void compile(){
        System.out.println("Compiling in desktop..");

    }
}
