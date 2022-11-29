package com.example.kbe.spring.demo.start;

import com.example.kbe.spring.demo.start.data.model.Fruits;
import com.example.kbe.spring.demo.start.ue2.endpoints.FruitsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(FruitsRepository foodRepository) {
		return (args) -> {

			foodRepository.save(Fruits
					.builder()
					.name("Chicken Boneless (ohne Knochen)")
					.currency("EUR")
					.category("food")
					.price(12.50F)
					.build());
			foodRepository.save(Fruits
					.builder()
					.name("Chicken Cuts (mit Knochen)")
					.currency("EUR")
					.category("food")
					.price(12.00F)
					.build());
			foodRepository.save(Fruits
					.builder()
					.name("Beef Dumpling")
					.currency("EUR")
					.category("side")
					.price(6.50F)
					.build());
		};
	}


}
