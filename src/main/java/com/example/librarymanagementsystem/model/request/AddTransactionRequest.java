package com.example.librarymanagementsystem.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddTransactionRequest {
    @NotBlank
    private String isbn;
    @NotBlank
    private  String finCode;
    @NotNull
    private Long days;
}
