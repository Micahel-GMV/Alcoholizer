package com.gudzenko.alcoholizer;

import com.gudzenko.alcoholizer.config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlcoholizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class<?>[] {AlcoholizerApplication.class, JpaConfig.class}, args);
	}
}
