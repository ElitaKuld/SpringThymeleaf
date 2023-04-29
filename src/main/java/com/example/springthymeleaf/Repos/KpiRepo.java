package com.example.springthymeleaf.Repos;

import com.example.springthymeleaf.Models.Kpi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KpiRepo extends JpaRepository<Kpi, Long> {
}
