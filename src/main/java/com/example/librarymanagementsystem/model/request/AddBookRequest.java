package com.example.librarymanagementsystem.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddBookRequest {
    @NotBlank
   private String isbn;
    @NotNull
  private Long detailId;
    @NotNull
 private Long publisherId;
}
