package com.example.librarymanagementsystem.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateBookRequest {
    @NotNull
    private Long id;
    @NotBlank
    private String isbn;
    @NotNull
    private Long detailId;
    @NotNull
    private Long publisherId;
}
