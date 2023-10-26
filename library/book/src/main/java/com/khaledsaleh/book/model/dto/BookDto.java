package com.khaledsaleh.book.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BookDto {
    @JsonProperty("book_name")
    private String bookName;
    @JsonProperty("book_category")
    private String bookCategory;
    @JsonProperty("author_id")
    private Integer authorId;
}
