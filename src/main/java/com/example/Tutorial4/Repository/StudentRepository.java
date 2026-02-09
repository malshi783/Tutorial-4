package com.example.Tutorial4.Repository;



import com.nsbm.studenthub.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
