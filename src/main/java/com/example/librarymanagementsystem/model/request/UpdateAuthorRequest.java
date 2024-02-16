package com.example.librarymanagementsystem.model.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateAuthorRequest {
    @NotNull
    private String name;
}
