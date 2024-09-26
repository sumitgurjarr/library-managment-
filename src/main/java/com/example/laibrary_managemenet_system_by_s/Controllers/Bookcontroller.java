package com.example.laibrary_managemenet_system_by_s.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.laibrary_managemenet_system_by_s.Model.book;
import com.example.laibrary_managemenet_system_by_s.Services.Bookservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Bookcontroller {
    @Autowired
    Bookservice bs;

    @GetMapping("/")
    public String home() {
        return "/home/home";
    }

    @GetMapping("/home/bookentry")
    public String savebook(Model model) {
        book book = new book();
        model.addAttribute("book", book);
        return "/home/bookentry";
    }


    @PostMapping("/bsave")
    public String bsave(@ModelAttribute("book") book book) {
        bs.bsave(book);
        return "redirect:/";
    }
  

}
