package br.com.treinamento.booksws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BooksWSApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksWSApplication.class, args);
	}
}
