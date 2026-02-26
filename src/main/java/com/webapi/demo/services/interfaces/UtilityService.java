package com.webapi.demo.services.interfaces;

import com.webapi.demo.models.Person;

import java.util.ArrayList;
import java.util.List;

public interface UtilityService {
    public ArrayList<Person> sortPeopleByAge(List<Person> unsortedPeople);
}
