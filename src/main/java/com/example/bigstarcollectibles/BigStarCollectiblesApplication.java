package com.example.bigstarcollectibles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EnableJpaRepositories(basePackages ="com.example.bigstarcollectibles", repositoryImplementationPostfix = "JpaImpl")
@EntityScan("com.example.bigstarcollectibles.domain")
public class BigStarCollectiblesApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BigStarCollectiblesApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BigStarCollectiblesApplication.class, args);
	}

}
