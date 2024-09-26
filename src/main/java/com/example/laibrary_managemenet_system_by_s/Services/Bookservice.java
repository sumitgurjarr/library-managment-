package com.example.laibrary_managemenet_system_by_s.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.laibrary_managemenet_system_by_s.Model.book;
import com.example.laibrary_managemenet_system_by_s.Repository.bookrepo;

@Service
public class Bookservice {
    @Autowired
    bookrepo br;
 // Book Entry..
 public void bsave(book book) {
    br.save(book);
    
}
//book view
public List<book> getAllBooks() {
    return br.findAll();
}
//book update
public book getBookById(int id) {
    Optional<book> optional = br.findById(id);
    book book = null;
    if (optional.isPresent())
        book = optional.get();
    else
        throw new RuntimeException(
                "Employee not found for id : " + id);
    return book;

}
//delete book
public void deleteBookById(int id) {
    br.deleteById(id);
}
  
}
