package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.entity.Author;
import com.example.librarymanagementsystem.model.request.AddAuthorRequest;
import com.example.librarymanagementsystem.model.request.UpdateAuthorRequest;
import com.example.librarymanagementsystem.model.response.AuthorResponse;
import com.example.librarymanagementsystem.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService{

    private final AuthorRepository authorRepository;
    @Override
    public ResponseEntity<?> createAuthor(AddAuthorRequest addAuthorRequest) {
        Author author = Author.builder()
                .name(addAuthorRequest.getName())
                .build();
        authorRepository.save(author);
        return new ResponseEntity<>(AuthorResponse.map(author), CREATED);
    }

    @Override
    public ResponseEntity<?> updateAuthor(UpdateAuthorRequest request, Long id) {
        Author author = authorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
        if (request.getName() != null) author.setName(request.getName());
        return new ResponseEntity<>(AuthorResponse.map(author), OK);
    }

    @Override
    public ResponseEntity<?> deleteAuthor(Long id) {
        Author author = authorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
        return new ResponseEntity<>(AuthorResponse.map(author), OK);
    }

    @Override
    public ResponseEntity<?> getAllAuthors() {
        List<Author> authors = authorRepository.findAll();
        return ResponseEntity.ok(authors.stream().map(AuthorResponse::map).toList());
    }

    @Override
    public ResponseEntity<?> getAuthorById(Long id) {
        Author author = authorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("not found"));
        return ResponseEntity.ok(AuthorResponse.map(author));
    }
}
