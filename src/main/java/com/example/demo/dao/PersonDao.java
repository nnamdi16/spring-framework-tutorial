package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PersonDao {
    int insertPerson(UUID id, Person person);

    //Method overloading
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }

    List<Person> selectAllPeople();
}
