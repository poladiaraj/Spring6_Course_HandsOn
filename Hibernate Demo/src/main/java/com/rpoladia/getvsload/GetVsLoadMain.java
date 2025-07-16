package com.rpoladia.getvsload;

import com.rpoladia.getvsload.entity.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class GetVsLoadMain {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration().addAnnotatedClass(Laptop.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();

        //get() executes the select query always, regardless of usage.
        //NOTE: This is also known as EAGER loading.
        /*
        Laptop laptop = session.get(Laptop.class, 1001);
        System.out.println(laptop);
        */

        //load() only executes the select query when the data is required.
        //During print the data is request and here the select query will get executed.
        /*
        Laptop laptop = session.load(Laptop.class, 1001);
        System.out.println(laptop);
        */

        //load() is deprecated in hibernate 6.x below is the alternative
        //During print the data is request and here the select query will get executed.
        //NOTE: This is also known as LAZY loading.
        Laptop laptop = session.byId(Laptop.class).getReference(1001);
        System.out.println(laptop);

        session.close();
        sf.close();
    }
}
