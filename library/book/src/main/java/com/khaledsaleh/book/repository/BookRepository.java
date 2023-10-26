package com.khaledsaleh.book.repository;

import com.khaledsaleh.book.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
