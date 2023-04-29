package com.example.springthymeleaf.Repos;

import com.example.springthymeleaf.Models.Kund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KundRepo extends JpaRepository<Kund, Long> {
}
