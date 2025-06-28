package com.rpoladia.springbootdemo.service;

import com.rpoladia.springbootdemo.model.Laptop;
import com.rpoladia.springbootdemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        //System.out.println("Method called");
        repo.save(lap);
    }

    public boolean isGoodFromProg(Laptop lap) {
        return true;
    }
}
