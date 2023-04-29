package com.example.springthymeleaf.Repos;

import com.example.springthymeleaf.Models.Konto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KontoRepo extends JpaRepository<Konto, Long> {


}
