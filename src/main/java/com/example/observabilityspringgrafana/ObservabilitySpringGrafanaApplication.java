package com.example.observabilityspringgrafana;

import com.example.observabilityspringgrafana.entities.Product;
import com.example.observabilityspringgrafana.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ObservabilitySpringGrafanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObservabilitySpringGrafanaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository){
		return args -> {
			productRepository.save(Product.builder().name("Computer").price(2499.9).build());
			productRepository.save(Product.builder().name("Smartphone").price(799.99).build());
			productRepository.save(Product.builder().name("Printer").price(74.95).build());
			productRepository.findAll().forEach(System.out::println);
		};
	}
}
