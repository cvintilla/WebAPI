package com.webapi.demo.services;

import com.webapi.demo.models.People;
import com.webapi.demo.services.interfaces.UtilityService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;

@Service
public class UtilityServiceImpl implements UtilityService {

    // sorts people by age, old -> young
    public ArrayList<People> sortPeopleByAge(ArrayList<People> unsortedPeople) {
        var sortedPeople = new ArrayList<>(unsortedPeople);

        sortedPeople.sort(Comparator.comparingInt(People::getAge).reversed());

        return sortedPeople;
    }
}
