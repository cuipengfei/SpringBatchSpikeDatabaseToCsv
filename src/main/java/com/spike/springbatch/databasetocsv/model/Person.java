package com.spike.springbatch.databasetocsv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "test.personalinfotable")
public class Person implements Serializable {

    String name;
    String hobby;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    int id;

    public Person() {
    }

    public Person(int id, String name, String hobby) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHobby() {
        return hobby;
    }
}