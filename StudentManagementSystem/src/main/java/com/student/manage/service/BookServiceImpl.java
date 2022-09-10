package com.student.manage.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.manage.model.Books;
import com.student.manage.repository.BooksRepository;

public class BookServiceImpl implements BookService {
	
	@Autowired
	BooksRepository bookRepo;
	
	public void addBook(Books book) {
		bookRepo.save(book);
	}
}
