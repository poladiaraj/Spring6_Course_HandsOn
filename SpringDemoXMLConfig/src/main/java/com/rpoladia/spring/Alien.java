package com.rpoladia.spring;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;

    //private Laptop lap;

    //Interfaces
    private Computer com;

    public Alien() {
        System.out.println("Alien object created!");
    }

    /*public Alien(int age) {
        System.out.println("Param constructor called");
    }*/

//    @ConstructorProperties({"pAge", "pLap"}) //These can be used as to avoid sequence while using 'name' attribute in constructor injection.
//    public Alien(int pAge, Laptop pLap) {
//        this.age = pAge;
//        this.lap = pLap;
//        System.out.println("All param consturctor called");
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int pAge) {
        //System.out.println("Setter called");
        this.age = pAge;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding");
        com.compile();
    }
}
