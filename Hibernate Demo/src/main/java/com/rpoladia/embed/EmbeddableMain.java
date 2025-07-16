package com.rpoladia.embed;

import com.rpoladia.embed.entity.Alien;
import com.rpoladia.embed.entity.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableMain {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setBrand("Apple");
        l1.setModel("MacBook AIR M4 15 inch");
        l1.setRam(16);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Raj");
        a1.setTech("Java");
        a1.setLaptop(l1);

        SessionFactory sf = new Configuration().addAnnotatedClass(Alien.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.persist(a1);
        tx.commit();

        //Here the select query is not executed... Why???
        Alien a2 = session.get(Alien.class, 101);
        System.out.println(a2);

        session.close();
        sf.close();
    }
}
