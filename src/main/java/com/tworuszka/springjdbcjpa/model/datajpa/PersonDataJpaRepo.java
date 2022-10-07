package com.tworuszka.springjdbcjpa.model.datajpa;

import com.tworuszka.springjdbcjpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;


public interface PersonDataJpaRepo extends JpaRepository<Person, Integer> {


}
