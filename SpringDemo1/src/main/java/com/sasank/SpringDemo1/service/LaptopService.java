package com.sasank.SpringDemo1.service;
import com.sasank.SpringDemo1.Repository.LaptopRepository;
import com.sasank.SpringDemo1.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;
    public LaptopRepository getRepo() {
        return repo;
    }

    public void setRepo(LaptopRepository repo) {
        this.repo = repo;
    }

    public void addLaptop(Laptop lap){
        repo.save(lap);
    }
    public boolean isGoodOrBad(Laptop lap){
        return true;
    }
}
