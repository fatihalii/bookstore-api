package com.example.bookstore.services;

import com.example.bookstore.model.Book;
import com.example.bookstore.repositories.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Optional<Book> getBookById(int id){
        return bookRepository.findById(id);
    }

    public List<Book> getAllBooks(){

        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);

        return books;
    }

    public Book getBookByAuthor(String author){
        return bookRepository.findBookByAuthor(author);
    }

    public Book getBookByTitle(String title){
        return bookRepository.findBookByTitle(title);
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public Book updateBook(int id, Book book){
        Optional<Book> dbBook = bookRepository.findById(id);

        dbBook.get().setTitle(book.getTitle());
        dbBook.get().setAuthor(book.getAuthor());
        dbBook.get().setIsbn(book.getIsbn());

        Book saveBook = dbBook.orElse(null);
        bookRepository.save(saveBook);
        return saveBook;
    }

    public void deleteBookById(int id){
        bookRepository.deleteById(id);
    }

}
