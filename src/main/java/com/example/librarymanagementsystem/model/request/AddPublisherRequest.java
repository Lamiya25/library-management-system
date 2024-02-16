package com.example.librarymanagementsystem.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddPublisherRequest {
    @NotBlank
    private String name;
}
