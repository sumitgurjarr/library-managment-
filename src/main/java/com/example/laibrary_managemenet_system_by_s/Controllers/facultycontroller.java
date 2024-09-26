package com.example.laibrary_managemenet_system_by_s.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.laibrary_managemenet_system_by_s.Model.Faculty;
import com.example.laibrary_managemenet_system_by_s.Services.facultyservice;

@Controller
public class facultycontroller {
@Autowired
facultyservice fs;


   @GetMapping("/home/facultyentry")
    public String saveFacultyEntry(Model model) {
        Faculty faculty = new Faculty();
        model.addAttribute("faculty", faculty);
        return "/home/facultyentry";
    }

    // Save Detail...

    @PostMapping("/fsave")
    public String fsave(@ModelAttribute("faculty") Faculty faculty) {
        fs.fsave(faculty);
        return "redirect:/";
    }








    
}
