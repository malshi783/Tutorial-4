package com.example.Tutorial4.Service;



import com.nsbm.studenthub.entity.Student;
import org.springframework.data.domain.Page;

public interface StudentService {
    Student saveStudent(Student student);
    Page<Student> getAllStudents(int page, int size, String sortBy);
}
