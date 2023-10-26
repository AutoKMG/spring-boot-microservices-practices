package com.khaledsaleh.book.model.dto;

import lombok.Data;

@Data
public class BookDto {
    private String bookName;
    private String bookCategory;
    private Integer authorId;
}
