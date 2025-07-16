package com.rpoladia.ddl;

import com.rpoladia.ddl.entity.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DDLMain {
    public static void main(String[] args) {
        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Raj");
        a1.setTech("Java");

        SessionFactory sf = new Configuration().addAnnotatedClass(Alien.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.persist(a1);
        tx.commit();

        session.close();
        sf.close();
    }
}
