package com.rpoladia.springbootjdbcdemo;

import com.rpoladia.springbootjdbcdemo.model.Student;
import com.rpoladia.springbootjdbcdemo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJdbcDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootJdbcDemoApplication.class, args);

        Student s = context.getBean(Student.class);
        s.setRollNo(100);
        s.setName("Poladia");
        s.setMarks(100);

        StudentService service = context.getBean(StudentService.class);
        service.addStudent(s);

        List<Student> students = service.getStudents();
        System.out.println("All Students:  " + students);
    }
}
