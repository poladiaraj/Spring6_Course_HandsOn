package com.rpoladia.studentappdocker.controller.repo;

import com.rpoladia.studentappdocker.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
