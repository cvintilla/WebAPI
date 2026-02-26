package com.webapi.demo.services.interfaces;

import com.webapi.demo.models.Person;
import com.webapi.demo.models.PersonRequest;

import java.util.ArrayList;

/// Person Service Interface
public interface PersonService {

    /// retrieves all the people in the db
    ArrayList<Person> getPeople();

    /// creates a person
    Person create(PersonRequest person);

    /// updates a person by id
    Person update(Long id, PersonRequest updatedPerson);

    /// delete person by id
    boolean deleteById(Long id);
}
