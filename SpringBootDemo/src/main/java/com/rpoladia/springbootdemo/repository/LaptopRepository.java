package com.rpoladia.springbootdemo.repository;

import com.rpoladia.springbootdemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("Saved in Database");
    }
}
