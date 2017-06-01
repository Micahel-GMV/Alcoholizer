package com.gudzenko.alcoholizer;

import com.gudzenko.alcoholizer.config.JpaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AlcoholizerApplication {

	@Autowired
	private ConsoleTest consoleTest;

	@PostConstruct
	public void init(){
		consoleTest.showEntries();
	}

	public static void main(String[] args) {
		SpringApplication.run(new Class<?>[] {AlcoholizerApplication.class, JpaConfig.class}, args);
	}
}
