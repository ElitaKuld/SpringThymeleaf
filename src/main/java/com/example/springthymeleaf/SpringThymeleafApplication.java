package com.example.springthymeleaf;

import com.example.springthymeleaf.Models.Kategori;
import com.example.springthymeleaf.Models.Kpi;
import com.example.springthymeleaf.Models.Kund;
import com.example.springthymeleaf.Repos.KategoriRepo;
import com.example.springthymeleaf.Repos.KpiRepo;
import com.example.springthymeleaf.Repos.KundRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringThymeleafApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(KpiRepo kpiRepo, KundRepo kundRepo, KategoriRepo katRepo){
		return (args) -> {
			Kpi k1 = new Kpi(45);
			Kpi k2 = new Kpi(76);
			Kpi k3 = new Kpi(3);

			Kategori kat1 = new Kategori("guld");
			Kategori kat2 = new Kategori("silver");
			Kategori kat3 = new Kategori("brons");
			Kategori kat4 = new Kategori("platinum");

			//Vill inte cascada kategorierna pga N-1, och pga "on delete cascade" inte önskvärt beteende
			katRepo.save(kat1);
			katRepo.save(kat2);
			katRepo.save(kat3);
			katRepo.save(kat4);

			Kund kund1 = new Kund("Mimmi", "435255", k1, kat1);
			Kund kund2 = new Kund("Börje", "435255", k2, kat1);
			Kund kund3 = new Kund("Elvis", "435255", k3, kat3);

			kundRepo.save(kund1);
			kundRepo.save(kund2);
			kundRepo.save(kund3);
		};
	}

}
