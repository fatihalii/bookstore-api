package com.example.bookstore.controllers;

import com.example.bookstore.model.Book;
import com.example.bookstore.services.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bookstore")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("GetById")
    public ResponseEntity<Book> getBookById(@RequestParam String id){
        int bookId = Integer.parseInt(id);
        Book book = bookService.getBookById(bookId).orElse(null);
        return ResponseEntity.ok(book);
    }

    @GetMapping("GetAll")
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity
                .ok()
                .body(bookService.getAllBooks());
    }

    @GetMapping("GetByAuthor")
    public ResponseEntity<Book> getBookByAuthor(@RequestParam String author){
        return ResponseEntity
                .ok()
                .body(bookService.getBookByAuthor(author));
    }

    @GetMapping("GetByTitle")
    public ResponseEntity<Book> getBookByTitle(@RequestParam String title){
        return ResponseEntity
                .ok()
                .body(bookService.getBookByTitle(title));
    }

    @PostMapping("Add")
    public ResponseEntity<String> addBook(@RequestBody Book book){
        bookService.addBook(book);
        return ResponseEntity
                .ok()
                .body("Book created.");
    }

    @PutMapping("Update")
    public ResponseEntity<Book> updateBook(@RequestParam String id, @RequestBody Book book){
        Book res = bookService.updateBook(Integer.parseInt(id),book);
        return ResponseEntity
                .ok()
                .body(res);
    }

    @DeleteMapping("Delete")
    public ResponseEntity<String> deleteBook(@RequestParam String id){
        bookService.deleteBookById(Integer.parseInt(id));
        return ResponseEntity
                .ok()
                .body("Book deleted.");
    }
}
