package com.tworuszka.springjdbcjpa;

import com.tworuszka.springjdbcjpa.model.jdbc.PersonJdbcDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
//@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {

	@Autowired
	PersonJdbcDAO personJdbcDAO;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("All users -> {}", personJdbcDAO.findAll());

		log.info("One user with id 10001 {}", personJdbcDAO.findById(10001));
	}
}
