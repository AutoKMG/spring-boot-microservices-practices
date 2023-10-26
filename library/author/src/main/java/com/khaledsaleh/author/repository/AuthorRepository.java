package com.khaledsaleh.author.repository;

import com.khaledsaleh.author.model.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
