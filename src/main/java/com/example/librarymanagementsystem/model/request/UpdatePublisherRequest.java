package com.example.librarymanagementsystem.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdatePublisherRequest {
    @NotNull
    private Long id;
    @NotBlank
    private String name;
}
