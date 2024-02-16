package com.example.librarymanagementsystem.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateDetailRequest {
    @NotNull
   private Long id;
    @NotBlank
    private String title;
    @NotBlank
   private String description;
    @NotNull
   private Integer unitsInStock;
    @NotNull
   private Long categoryId;
    @NotNull
   private Long authorId;
}
