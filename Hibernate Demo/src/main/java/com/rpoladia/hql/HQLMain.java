package com.rpoladia.hql;

import com.rpoladia.hql.entity.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HQLMain {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration().addAnnotatedClass(Laptop.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();

        //Basic get() call, this only works with primary key.
        /*
        Laptop l1 = session.get(Laptop.class, 1001);
        System.out.println("L1: " + l1);
        */

        //SQL: select * from laptop where ram=32
        //HQL: from laptop where ram=32
        //NOTE: HQL is case sensitive, entity(class) name should follow proper casing
        /*
        Query query = session.createQuery("from Laptop");
        List<Laptop> laptops = query.list();
        for (Laptop laptop : laptops) {
            System.out.println("Laptop: " + laptop);
        }
        */

        //Selecting all the columns
        /*
        Query query = session.createQuery("from Laptop where brand like ?1");
        query.setParameter(1, "Apple");
        List<Laptop> laptops = query.list();
        for (Laptop laptop : laptops) {
            System.out.println("Laptop: " + laptop);
        }
        */

        //Selecting specific columns
        Query query = session.createQuery("select brand, model from Laptop where lid > ?1");
        query.setParameter(1, 1000);
        List<Object[]> laptops = query.list();
        for (Object[] laptop : laptops) {
            //System.out.println("Laptop: " + laptop);
            System.out.println((String)laptop[0] + " " + (String)laptop[1]);
        }

        session.close();
        sf.close();
    }
}
