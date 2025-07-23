package com.rpoladia.studentappdocker.controller;

import com.rpoladia.studentappdocker.controller.repo.StudentRepo;
import com.rpoladia.studentappdocker.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents() {
        //return List.of(new Student(1, "Raj", 29), new Student(2, "Deshna", 25), new Student(3, "Sheela", 51));

        return studentRepo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent() {
        Student s = new Student();
        s.setName("Raj");
        s.setAge(30);

        studentRepo.save(s);
    }
}
