package com.rpoladia;

import com.rpoladia.crud.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );

        Student s1 =new Student();
        s1.setsName("Poladia");
        s1.setRollNo(105);
        s1.setsAge(600);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Student.class); //NOTE: Add the annotation on the class
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.save(s1);
        tx.commit();

        System.out.println(s1);
    }
}
