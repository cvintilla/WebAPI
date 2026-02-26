package com.webapi.demo.services.interfaces;

import com.webapi.demo.models.Person;

import java.util.ArrayList;
import java.util.List;

/// utility service interface
public interface UtilityService {

    /// Sorts people eldest to youngest
    public ArrayList<Person> sortPeopleByAge(List<Person> unsortedPeople);
}
