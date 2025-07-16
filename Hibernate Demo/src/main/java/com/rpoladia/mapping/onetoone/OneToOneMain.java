package com.rpoladia.mapping.onetoone;

import com.rpoladia.mapping.onetoone.entity.Alien;
import com.rpoladia.mapping.onetoone.entity.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneMain {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setLid(1001);
        l1.setBrand("Apple");
        l1.setModel("MacBook AIR M4 15 inch");
        l1.setRam(16);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Raj");
        a1.setTech("Java");
        a1.setLaptop(l1);

        SessionFactory sf = new Configuration().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.persist(l1);
        session.persist(a1);
        tx.commit();

        Alien a2 = session.get(Alien.class, 101);
        System.out.println(a2);
    }
}
