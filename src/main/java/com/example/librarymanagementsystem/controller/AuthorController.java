package com.example.librarymanagementsystem.controller;

import com.example.librarymanagementsystem.model.request.AddAuthorRequest;
import com.example.librarymanagementsystem.model.request.UpdateAuthorRequest;
import com.example.librarymanagementsystem.service.AuthorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/author")
@RequiredArgsConstructor
class AuthorController {
    private final AuthorService authorService;
    @GetMapping
    public ResponseEntity<?> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping
    public ResponseEntity<?> addAuthor(@RequestBody @Valid AddAuthorRequest request) {
        return authorService.createAuthor(request);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateAuthor(@PathVariable Long id, @RequestBody UpdateAuthorRequest request) {
        return authorService.updateAuthor(request,id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAuthor(@PathVariable Long id) {
        return authorService.deleteAuthor(id);
    }
}
