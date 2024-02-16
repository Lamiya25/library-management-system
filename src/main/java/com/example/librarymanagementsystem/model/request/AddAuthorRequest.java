package com.example.librarymanagementsystem.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddAuthorRequest {
    @NotBlank
    private String name;
}
