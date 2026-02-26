package com.webapi.demo.services;

import com.webapi.demo.models.People;
import com.webapi.demo.services.interfaces.UtilityService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class UtilityServiceImpl implements UtilityService {

    // sorts people by age, young -> old
    public List<People> sortPeopleByAge(List<People> unsortedPeople) {
        var sortedPeople = new ArrayList<>(unsortedPeople);

        sortedPeople.sort(Comparator.comparingInt(People::getAge));

        return sortedPeople;
    }
}
