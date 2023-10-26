package com.khaledsaleh.book.controller;

import com.khaledsaleh.book.model.dto.BookDto;
import com.khaledsaleh.book.model.entity.Book;
import com.khaledsaleh.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.apache.http.protocol.HTTP;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService service;

    @GetMapping
    public List<Book> getAllBooks(){
        return service.findAllBooks();
    }

    @PostMapping
    public void saveBook(BookDto book){
        service.saveBook(book);
    }
}
