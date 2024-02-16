package com.example.librarymanagementsystem.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Set;

@Data
public class AddDetailsRequest {
    @NotBlank
    private  String title;
    @NotBlank
    private String description;
    @NotNull
    private Integer unitsInStock;
    @NotNull
   private Set<Long> categoryIds;
    @NotNull
    private Set<Long> authorIds;
}
