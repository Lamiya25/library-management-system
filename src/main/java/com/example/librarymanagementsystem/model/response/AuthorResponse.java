package com.example.librarymanagementsystem.model.response;

import com.example.librarymanagementsystem.entity.Author;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthorResponse
{
    private Long id;
    private String name;


    public static AuthorResponse map(Author author){
        return AuthorResponse.builder()
                .id(author.getId())
                .name(author.getName())
                .build();
    }
}
