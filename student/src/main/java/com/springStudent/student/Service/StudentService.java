package com.springStudent.student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springStudent.student.Entity.Student;
import com.springStudent.student.Repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public void saveorUpdate(Student students) {

        repo.save(students);
    }

    public Iterable<Student> listAll() {

        return this.repo.findAll();
    }


    public void deleteStudent(Integer id) {

        repo.deleteById(id);
    }

    public Student getStudentByID(Integer studentid) {

        return repo.findById(studentid).get();
    }
}