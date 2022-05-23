package com.ayh.appmetricsmon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AppmetricsmonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppmetricsmonApplication.class, args);
	}

}
