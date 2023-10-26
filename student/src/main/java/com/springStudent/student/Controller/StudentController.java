package com.springStudent.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springStudent.student.Entity.Student;
import com.springStudent.student.Service.StudentService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentServices;

    @PostMapping(value = "/save")
    private Integer saveStudent(@RequestBody Student students) {

        studentServices.saveorUpdate(students);
        return students.getId();
    }
    
    @GetMapping(value = "/getall")
    public Iterable<Student> getStudents() {
        return studentServices.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    private Student update(@RequestBody Student student, @PathVariable(name = "id") Integer id) {
        student.setId(id);
        studentServices.saveorUpdate(student);
        return student;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteStudent(@PathVariable("id") Integer id) {
        studentServices.deleteStudent(id);
    }


    @RequestMapping("/search/{id}")
    private Student getStudents(@PathVariable(name = "id") Integer studentid) {
        return studentServices.getStudentByID(studentid);
    }

}