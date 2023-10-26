package com.khaledsaleh.book.repository;

import com.khaledsaleh.book.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findAllByAuthorId(Integer authorId);
}
