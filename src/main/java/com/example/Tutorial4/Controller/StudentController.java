package com.example.Tutorial4.Controller;

import com.example.Tutorial4.entity.Student;
import com.example.Tutorial4.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping
    public Page<Student> getStudents(
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam String sortBy) {
        return service.getAllStudents(page, size, sortBy);
    }
}
