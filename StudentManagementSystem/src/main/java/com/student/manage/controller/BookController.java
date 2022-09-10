package com.student.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.manage.model.Books;
import com.student.manage.repository.BooksRepository;
import com.student.manage.service.BookService;


@RestController
public class BookController
{
    @Autowired
    BookService services;
    @Autowired
    BooksRepository bookRepository;
    @PostMapping("/addbooks")
    public String add(@RequestBody Books book) {
    	
    	services.addBook(book);  
    	return "Successfully Added";
    }
}