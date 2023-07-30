package com.example.bookstore.repositories;


import com.example.bookstore.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
    Book findBookByTitle(String title);
    Book findBookByAuthor(String author);

}
