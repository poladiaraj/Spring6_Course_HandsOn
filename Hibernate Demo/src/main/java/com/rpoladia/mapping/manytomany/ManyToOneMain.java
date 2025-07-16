package com.rpoladia.mapping.manytomany;

import com.rpoladia.mapping.manytomany.entity.Alien;
import com.rpoladia.mapping.manytomany.entity.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyToOneMain {
    public static void main(String[] args) {

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Raj");
        a1.setTech("Java");

        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("Deshna");
        a2.setTech("Design");


        List<Alien> aliens = new ArrayList<>();
        aliens.add(a1);
        aliens.add(a2);

        Laptop l1 = new Laptop();
        l1.setLid(1001);
        l1.setBrand("Apple");
        l1.setModel("MacBook AIR M4 15 inch");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(1002);
        l2.setBrand("HP");
        l2.setModel("Envy 13");
        l2.setRam(8);

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(l1);
        laptops.add(l2);

        a1.setLaptops(laptops);
        a2.setLaptops(Arrays.asList(l1));
        l1.setAliens(aliens);
        l2.setAliens(Arrays.asList(a1));

        SessionFactory sf = new Configuration().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.persist(l1);
        session.persist(l2);
        session.persist(a1);
        session.persist(a2);
        tx.commit();

        Alien a5 = session.get(Alien.class, 101);

        session.close();
        sf.close();
    }
}
