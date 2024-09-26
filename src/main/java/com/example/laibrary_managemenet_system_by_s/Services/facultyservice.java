package com.example.laibrary_managemenet_system_by_s.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.laibrary_managemenet_system_by_s.Model.Faculty;
import com.example.laibrary_managemenet_system_by_s.Repository.facultyrepo;

@Service
public class facultyservice {
@Autowired
facultyrepo fr;

 public void fsave(Faculty faculty) {
        fr.save(faculty);
    }
    public Faculty getFacultyById(int id) {
        Optional<Faculty> optional = fr.findById(id);
        Faculty faculty = null;
        if (optional.isPresent())
            faculty = optional.get();
        else
            throw new RuntimeException(
                    "Customer not found for id : " + id);
        return faculty;
    }
    public void deleteFacultyById(int id) {
        fr.deleteById(id);
    }   

    // faculty details

    public List<Faculty> getAllFacultys() {
        return fr.findAll();
    }



    
}
