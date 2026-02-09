package com.example.Tutorial4.service.impl;

import com.example.Tutorial4.entity.Student;
import com.example.Tutorial4.Repository.StudentRepository;
import com.example.Tutorial4.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    @Override
    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public Page<Student> getAllStudents(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return repo.findAll(pageable);
    }
}
