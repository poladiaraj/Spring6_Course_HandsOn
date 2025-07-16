package com.rpoladia.mapping.onetomany;

import com.rpoladia.mapping.onetomany.entity.Alien;
import com.rpoladia.mapping.onetomany.entity.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class OneToManyMain {
    public static void main(String[] args) {

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Raj");
        a1.setTech("Java");

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

        SessionFactory sf = new Configuration().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.persist(l1);
        session.persist(l2);
        session.persist(a1);
        tx.commit();

        Alien a2 = session.get(Alien.class, 101);
        System.out.println(a2);

        session.close();
        sf.close();
    }
}
