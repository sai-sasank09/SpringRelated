package com.sasank.SpringDemo1.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien implements Computer {
    @Value("25")
    private int age;
    private Computer com;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }


    public void compile() {
        com.compile();
    }
}
