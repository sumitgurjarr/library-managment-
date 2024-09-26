package com.example.laibrary_managemenet_system_by_s.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "faculty8900")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int Facultyid;
    String facultyname;
    String facultyno;
    public Faculty(int facultyid, String facultyname, String facultyno) {
        Facultyid = facultyid;
        this.facultyname = facultyname;
        this.facultyno = facultyno;
    }
    public Faculty() {
    }
    public int getFacultyid() {
        return Facultyid;
    }
    public void setFacultyid(int facultyid) {
        Facultyid = facultyid;
    }
    public String getFacultyname() {
        return facultyname;
    }
    public void setFacultyname(String facultyname) {
        this.facultyname = facultyname;
    }
    public String getFacultyno() {
        return facultyno;
    }
    public void setFacultyno(String facultyno) {
        this.facultyno = facultyno;
    }

    

    
}
