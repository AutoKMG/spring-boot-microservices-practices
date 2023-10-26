package com.khaledsaleh.author.controller;

import com.khaledsaleh.author.model.dto.AuthorDto;
import com.khaledsaleh.author.model.entity.Author;
import com.khaledsaleh.author.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/author")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService service;

    @GetMapping
    public List<Author> getAllAuthors(){
        return service.getAllAuthors();
    }

    @PostMapping
    public void saveAuthor(@RequestBody AuthorDto author){
        service.saveAuthor(author);
    }
 }
