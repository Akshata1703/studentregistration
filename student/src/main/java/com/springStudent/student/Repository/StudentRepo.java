package com.springStudent.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springStudent.student.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    
}
