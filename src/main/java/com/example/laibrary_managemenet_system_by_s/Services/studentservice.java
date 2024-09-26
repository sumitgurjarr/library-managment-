package com.example.laibrary_managemenet_system_by_s.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.laibrary_managemenet_system_by_s.Model.Student;
import com.example.laibrary_managemenet_system_by_s.Repository.studentrepo;

@Service
public class studentservice {
@Autowired
studentrepo sr;

public void ssave(Student student) {
    sr.save(student);
}
 

  }
