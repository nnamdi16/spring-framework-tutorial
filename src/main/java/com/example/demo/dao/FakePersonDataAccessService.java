package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("personDao")
public class FakePersonDataAccessService  implements PersonDao {
    private static List <Person> DB  = new ArrayList<>();


    @Override

    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id,person.getName()));
        return 1;
    }


    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }
}
