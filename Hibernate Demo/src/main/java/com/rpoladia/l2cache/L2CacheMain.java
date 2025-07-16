package com.rpoladia.l2cache;

import com.rpoladia.l2cache.entity.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class L2CacheMain {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration().addAnnotatedClass(Laptop.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session1 = sf.openSession();

        Laptop laptop1 = session1.get(Laptop.class, 1001);
        System.out.println(laptop1);

        session1.close();

        Session session2 = sf.openSession();

        Laptop laptop2 = session2.byId(Laptop.class).getReference(1001);
        System.out.println(laptop2);

        session2.close();

        sf.close();
    }
}
