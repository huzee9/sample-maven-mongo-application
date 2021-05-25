package com.practice.samplemavenmongoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.practice.samplemavenmongoapplication.repository.IssueRepository;

@EnableMongoRepositories(basePackageClasses = IssueRepository.class)
@SpringBootApplication
public class SampleMavenMongoApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(SampleMavenMongoApplication.class, args);
	}

}
