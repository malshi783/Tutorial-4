package com.example.Tutorial4.Repository;

import com.example.Tutorial4.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
