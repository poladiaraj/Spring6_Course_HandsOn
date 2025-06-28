package com.rpoladia.springdatajpa.repo;

import com.rpoladia.springdatajpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//That's it, only interface is required, Spring framework will take care of rest.
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    //@Query("select s from Student s where s.name = ?1")
    List<Student> findByName(String name); //JPA uses Domain Specific Language (DSL), it creates certain queries BTS which can be used directly

    List<Student> findByMarks(int marks);

    List<Student> findByMarksGreaterThan(int marks);
}
