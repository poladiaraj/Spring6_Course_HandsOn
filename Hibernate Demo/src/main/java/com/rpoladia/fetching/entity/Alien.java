package com.rpoladia.fetching.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Alien {
    @Id
    private int aid;
    @Column(name = "alien_name")
    private String aname;
    private String tech;
    //For collections by default there will be Lazy fetch, only when data is required it will be fetched.
    //NOTE: By default fetch type is LAZY
    @OneToMany(fetch = FetchType.EAGER)
    private List<Laptop> laptops;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
