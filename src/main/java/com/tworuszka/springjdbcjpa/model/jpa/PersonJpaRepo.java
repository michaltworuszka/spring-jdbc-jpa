package com.tworuszka.springjdbcjpa.model.jpa;

import com.tworuszka.springjdbcjpa.model.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonJpaRepo {

    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

    public List<Person> findAll() {
        Query query = entityManager.createNamedQuery("find_all_persons", Person.class);
        return query.getResultList();
    }

    public Person insert(Person person) {
        return entityManager.merge(person);
    }

    public Person update(Person person) {
        return entityManager.merge(person);
    }

    public void deleteById(int id) {
        Person person = this.findById(id);
        entityManager.remove(person);
    }
}
