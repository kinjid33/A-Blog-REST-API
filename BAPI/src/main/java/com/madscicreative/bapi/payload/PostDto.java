package com.madscicreative.bapi.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {
    private long id;
//    not null or empty
//    at least two characters
    @NotEmpty
    @Size(min = 2, message = "post title should have at least 2 characters")
    private String title;
//    not null or empty
//    at least 10 characters
    @NotEmpty
    @Size(min = 10, message = "post description should have at least 10 characters")
    private String description;
//    not null or empty
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}