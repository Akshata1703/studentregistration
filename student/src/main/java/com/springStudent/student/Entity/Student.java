package com.springStudent.student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String studentname;
    private String studentaddress;
    private String mobile;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getStudentname() {
        return studentname;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public String getStudentaddress() {
        return studentaddress;
    }
    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public Student(Integer id, String studentname, String studentaddress, String mobile) {
        this.id = id;
        this.studentname = studentname;
        this.studentaddress = studentaddress;
        this.mobile = mobile;
    }
    public Student() {
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", studentname=" + studentname + ", studentaddress=" + studentaddress + ", mobile="
                + mobile + "]";
    }

    

    

   
    
}
