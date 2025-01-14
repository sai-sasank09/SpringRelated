package com.sasank.SpringDemo1.Repository;

import com.sasank.SpringDemo1.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in Database");
    }
}
