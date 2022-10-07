package com.tworuszka.springjdbcjpa.model;

import lombok.*;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@NamedQuery(name = "find_all_persons", query = "select p from Person p")
public class Person {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String location;

    public Person(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "\nPerson {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
