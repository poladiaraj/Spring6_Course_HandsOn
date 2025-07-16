package com.rpoladia.mapping.onetoone.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Alien {
    @Id
    private int aid;
    @Column(name = "alien_name")
    private String aname;
    private String tech;
    //Specify relation whenever another entity is used, otherwise get will not work
    @OneToOne
    private Laptop laptop;

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

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
