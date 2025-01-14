package com.sasank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    public Alien(){
//        System.out.println("Object Created");
    }



    //    Alien(int age,Laptop lap){
//        System.out.println("constructor created");
//        this.age=age;
//        this.lap=lap;
//    }


  private Computer cm;
    public Computer getCm() {
        return cm;
    }
    @Autowired
    @Qualifier("desktop")
    public void setCm(Computer cm) {
        this.cm = cm;
    }
//    private  Laptop lap;
    @Value("21")
    private int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Setter called");
        this.age = age;
    }
//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }

    public void code(){
        System.out.println("Codinggg");
        cm.compile();
    }
}
