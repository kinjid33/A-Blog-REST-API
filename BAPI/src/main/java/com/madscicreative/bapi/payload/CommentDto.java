package com.madscicreative.bapi.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private Long id;
//    not null or empty
    @NotEmpty(message = "name should not be null or empty")
    private String name;
//    not null or empty
//    email validation
    @NotEmpty
    @Email(message = "must be a well formed email address")
    private String email;
//    not null or empty
//    minimum 10 characters
    @NotEmpty
    @Size(min = 10, message = "comment must not be less than 10 characters")
    private String body;
}