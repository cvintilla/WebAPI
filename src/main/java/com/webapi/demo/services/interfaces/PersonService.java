package com.webapi.demo.services.interfaces;

import com.webapi.demo.models.Person;

import java.util.ArrayList;

// Person Service Interface
public interface PersonService {
    // retrieves all the people in the db
    ArrayList<Person> getPeople();

    // creates a person
    Person create(Person person);

    //updates a person by id
    Person update(Long id, Person updatedPerson);

    boolean deleteById(Long id);
}
