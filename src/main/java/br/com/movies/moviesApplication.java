package br.com.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@ComponentScan({ "br.com.movies" })
@Slf4j
public class moviesApplication {

	public static void main(String[] args) {
		log.info("Starting WebServices ...");
				
		SpringApplication.run(moviesApplication.class, args);
	}

}
