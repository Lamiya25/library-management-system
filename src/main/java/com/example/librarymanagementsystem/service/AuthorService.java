package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.entity.Author;
import com.example.librarymanagementsystem.model.request.AddAuthorRequest;
import com.example.librarymanagementsystem.model.request.UpdateAuthorRequest;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;

public interface AuthorService {

    ResponseEntity<?>createAuthor(AddAuthorRequest addAuthorRequest);
    ResponseEntity<?>updateAuthor(UpdateAuthorRequest request, Long id);
    ResponseEntity<?>deleteAuthor(Long id);
    ResponseEntity<?>getAllAuthors();
    ResponseEntity<?>getAuthorById(Long id);

}
