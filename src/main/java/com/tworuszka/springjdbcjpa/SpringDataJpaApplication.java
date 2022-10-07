package com.tworuszka.springjdbcjpa;

import com.tworuszka.springjdbcjpa.model.Person;
import com.tworuszka.springjdbcjpa.model.datajpa.PersonDataJpaRepo;
import com.tworuszka.springjdbcjpa.model.jpa.PersonJpaRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

	@Autowired
	PersonDataJpaRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//log.info("All users -> {}", personJdbcDAO.findAll());

		log.info("One user with id 10001 {}", repo.findById(10001));


		log.info("Inserting 10004 -> {}",
				repo.save(new Person(10004, "Tara", "Berlin")));

		log.info("Update 10003 -> {}",
				repo.save(new Person(10003, "Pieter", "Utrecht")));

		repo.deleteById(10002);
		log.info("Deleting 10002 {}", repo.findById(10002));

		log.info("Find all person {}",repo.findAll());
	}
}
