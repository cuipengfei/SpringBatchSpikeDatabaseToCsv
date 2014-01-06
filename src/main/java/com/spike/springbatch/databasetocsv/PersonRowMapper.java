package com.spike.springbatch.databasetocsv;

import com.spike.springbatch.databasetocsv.model.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRowMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        String hobby = resultSet.getString("hobby");

        return new Person(id, name, hobby);
    }
}