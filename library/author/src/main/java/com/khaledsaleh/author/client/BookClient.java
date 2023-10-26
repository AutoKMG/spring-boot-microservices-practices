package com.khaledsaleh.author.client;

import com.khaledsaleh.author.model.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "book-service", url = "${application.config.book-url}")
public interface BookClient {

    @GetMapping("/{author-id}")
    List<Book> getAllBooksWithAuthorId(@PathVariable("author-id") Integer authorId);
}
