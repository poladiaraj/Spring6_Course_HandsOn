package com.rpoladia.springdatajpa;

import com.rpoladia.springdatajpa.model.Student;
import com.rpoladia.springdatajpa.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

        /*s1.setRollNo(101);
        s1.setName("Deshna");
        s1.setMarks(75);

        s2.setRollNo(102);
        s2.setName("Raj");
        s2.setMarks(82);

        s3.setRollNo(103);
        s3.setName("Sheela");
        s3.setMarks(90);

        repo.save(s1);
        repo.save(s2);
        repo.save(s3);*/

        /*System.out.println(repo.findAll());
        System.out.println(repo.findById(102)); //findById() return Optional
        System.out.println(repo.findById(105).orElse(new Student()));*/

        /*System.out.println(repo.findByName("Deshna"));
        System.out.println(repo.findByMarks(90));
        System.out.println(repo.findByMarksGreaterThan(80));*/

        s1.setRollNo(101);
        s1.setName("Deshna");
        s1.setMarks(79);
        repo.save(s1);

        s2.setRollNo(102);
        s2.setName("Raj");
        s2.setMarks(82);
        repo.delete(s2);
    }

}
