package com.example.laibrary_managemenet_system_by_s.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="librarymanagement")
public class book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int bookid;
    String bookname; 
    String bookprice;
    public book(int bookid, String bookname, String bookprice) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.bookprice = bookprice;
    }
    public book() {
    }
    public int getBookid() {
        return bookid;
    }
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public String getBookprice() {
        return bookprice;
    }
    public void setBookprice(String bookprice) {
        this.bookprice = bookprice;
    }


    
}
