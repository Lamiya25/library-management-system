package com.example.librarymanagementsystem.repository;

import com.example.librarymanagementsystem.model.ConfirmationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfirmationTokenResponseRepository extends JpaRepository<ConfirmationToken, Long> {
}
