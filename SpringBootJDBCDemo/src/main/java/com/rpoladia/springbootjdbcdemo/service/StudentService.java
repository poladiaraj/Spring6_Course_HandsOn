package com.rpoladia.springbootjdbcdemo.service;

import com.rpoladia.springbootjdbcdemo.model.Student;
import com.rpoladia.springbootjdbcdemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student student) {
        //System.out.println("Added student");
        repo.save(student);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
