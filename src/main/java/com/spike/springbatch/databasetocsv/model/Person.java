package com.spike.springbatch.databasetocsv.model;

public class Person {

    String name;
    String hobby;
    int id;

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