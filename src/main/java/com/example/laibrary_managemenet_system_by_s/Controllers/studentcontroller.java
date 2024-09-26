package com.example.laibrary_managemenet_system_by_s.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.laibrary_managemenet_system_by_s.Model.Student;
import com.example.laibrary_managemenet_system_by_s.Services.studentservice;





@Controller

public class studentcontroller {
@Autowired
studentservice ss;
 @GetMapping("/home/studententry")
    public String saveFacultyEntry(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "/home/studententry";
    }
     @PostMapping("/ssave")
    public String fsave(@ModelAttribute("faculty") Student student) {
        ss.ssave(student);
        return "redirect:/";
    }


 




}
