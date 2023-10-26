package com.khaledsaleh.author.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullAuthorResponse {
    private String firstName;
    private String lastName;
    private List<Book> books;
}
