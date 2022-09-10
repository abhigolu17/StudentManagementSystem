package com.student.manage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.student.manage.model.Books;

public interface BooksRepository extends MongoRepository<Books, Integer> {


}
