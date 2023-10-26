package com.khaledsaleh.book.service;

import com.khaledsaleh.book.model.dto.BookDto;
import com.khaledsaleh.book.model.entity.Book;
import com.khaledsaleh.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository repository;

    public List<Book> getAllBooks(){
        return repository.findAll();
    }

    public List<Book> getAllBooksWithAuthorId(Integer authorId){
        return repository.findAllByAuthorId(authorId);
    }

    public void saveBook(BookDto book){
        Book newBook = new Book();
        newBook.setBookName(book.getBookName());
        newBook.setBookCategory(book.getBookCategory());
        newBook.setAuthorId(book.getAuthorId());
        repository.save(newBook);
    }
}
