package com.example.laibrary_managemenet_system_by_s.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student098")
public class Student {
 @Id 
 @GeneratedValue(strategy = GenerationType.AUTO)
 int  studentname;
 String studentid;
 String studentno;
public Student(int studentname, String studentid, String studentno) {
    this.studentname = studentname;
    this.studentid = studentid;
    this.studentno = studentno;
}
public Student() {
}
public int getStudentname() {
    return studentname;
}
public void setStudentname(int studentname) {
    this.studentname = studentname;
}
public String getStudentid() {
    return studentid;
}
public void setStudentid(String studentid) {
    this.studentid = studentid;
}
public String getStudentno() {
    return studentno;
}
public void setStudentno(String studentno) {
    this.studentno = studentno;
}
}
