package com.webapi.demo.services;

import com.webapi.demo.models.Person;
import com.webapi.demo.services.interfaces.UtilityService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class UtilityServiceImpl implements UtilityService {

    // sorts people by age, old -> young
    @Override
    public ArrayList<Person> sortPeopleByAge(List<Person> unsortedPeople) {
        var sortedPeople = new ArrayList<>(unsortedPeople);

        sortedPeople.sort(Comparator.comparingInt(Person::getAge).reversed());

        return sortedPeople;
    }
}
