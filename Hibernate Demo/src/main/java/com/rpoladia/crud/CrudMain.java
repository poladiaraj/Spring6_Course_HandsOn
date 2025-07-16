package com.rpoladia.crud;

import com.rpoladia.crud.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudMain {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().addAnnotatedClass(Student.class).configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();

        //persist() requires transaction
        //Student s1 =new Student();
        //s1.setsName("Student");
        //s1.setRollNo(106);
        //s1.setsAge(18);
        //Transaction tx = session.beginTransaction();
        //session.persist(s1);
        //tx.commit();
        //System.out.println(s1);

        //get() does not require transaction
        //NOTE: This can return null, so be vigilant
        //Student s2 = session.get(Student.class, 101);
        //System.out.println(s2);

        //merge() requires transaction
        //NOTE: This will first first fire select query to check whether the data exist, if no it will create it.
        //Student s3 = new Student();
        //s3.setsName("Updated Name");
        //s3.setRollNo(106);
        ///s3.setsAge(19);
        //Transaction tx = session.beginTransaction();
        //session.merge(s3);
        //tx.commit();
        //System.out.println(s3);


        //remove() requires transaction
        //NOTE: It takes object as input, so get the object first and pass it to remove.
        Student s4 = session.get(Student.class, 106);
        Transaction tx = session.beginTransaction();
        session.remove(s4);
        tx.commit();
        System.out.println(s4);
        session.close();
        sf.close();
    }
}
