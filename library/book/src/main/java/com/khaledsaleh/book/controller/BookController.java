package com.khaledsaleh.book.controller;

import com.khaledsaleh.book.model.dto.BookDto;
import com.khaledsaleh.book.model.entity.Book;
import com.khaledsaleh.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService service;

    @GetMapping
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }

    @PostMapping
    public void saveBook(@RequestBody BookDto book){
        service.saveBook(book);
    }
}
