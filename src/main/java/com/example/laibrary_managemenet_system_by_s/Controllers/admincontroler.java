package com.example.laibrary_managemenet_system_by_s.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.laibrary_managemenet_system_by_s.Model.Faculty;
import com.example.laibrary_managemenet_system_by_s.Model.book;
import com.example.laibrary_managemenet_system_by_s.Services.Bookservice;
import com.example.laibrary_managemenet_system_by_s.Services.facultyservice;

@Controller
public class admincontroler {
@Autowired
  Bookservice bs;
 @Autowired
  facultyservice fs;
   @GetMapping("admin/admin")
    public String home() {
        return "/Admin/Admin";
    
}
//details book
@GetMapping("/admin/bookview")
public String bookView(Model model) {
    model.addAttribute("books", bs.getAllBooks());
    return "/admin/bookview";
}
//faculty details

@GetMapping("/admin/facultyview")
public String facultyView(Model model) {
    model.addAttribute("faculties", fs.getAllFacultys());
    return "/admin/facultyview";
}

//book update
 @GetMapping("/showFormForUpdateBook/{id}")
    public String updateBookForm(@PathVariable(value = "id") int id, Model model) {
        model.addAttribute("book", bs.getBookById(id));
        return "/update/bookupdate";
    }
    @PostMapping("/dsave")
    public String bsave(@ModelAttribute("book") book book) {
        bs.bsave(book);
        return "redirect: /admin/bookview";
    }
    //delete book

    @GetMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable(value = "id") int id) {
        bs.deleteBookById(id);
        return "redirect: /admin/bookview";
    }
    //updATE FAUCLTY
      @GetMapping("/showFormForUpdateFaculty/{id}")
    public String updateFacultyForm(@PathVariable(value = "id") int id, Model model) {
        model.addAttribute("faculty", fs.getFacultyById(id));
        return "/Update/facultyupdate";
    }

    // Save Faculty
    @PostMapping("/fupsave")
    public String fsave(@ModelAttribute("faculty") Faculty faculty) {
        fs.fsave(faculty);
        return "redirect: /admin/facultyview";
    }
// DELETE FACULTY


@GetMapping("/deleteFaculty/{id}")
public String deleteFaculty(@PathVariable(value = "id") int id) {
    fs.deleteFacultyById(id);
    return "redirect:/admin/facultyview";
}

    
 
}

