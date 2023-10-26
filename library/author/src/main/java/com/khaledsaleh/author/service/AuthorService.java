package com.khaledsaleh.author.service;

import com.khaledsaleh.author.model.dto.AuthorDto;
import com.khaledsaleh.author.model.entity.Author;
import com.khaledsaleh.author.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository repository;

    public List<Author> getAllAuthors(){
        return repository.findAll();
    }

    public void saveAuthor(AuthorDto author){
        Author newAuthor = new Author();
        newAuthor.setFirstName(author.getFirstName());
        newAuthor.setLastName(author.getLastName());
        repository.save(newAuthor);
    }
}
