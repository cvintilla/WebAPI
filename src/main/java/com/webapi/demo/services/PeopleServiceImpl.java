package com.webapi.demo.services;

import com.webapi.demo.models.People;
import com.webapi.demo.repositories.interfaces.PeopleRepository;
import com.webapi.demo.services.interfaces.PeopleService;
import com.webapi.demo.services.interfaces.UtilityService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PeopleServiceImpl implements PeopleService {

    private final PeopleRepository peopleRepository;
    private final UtilityService utilityService;

    public PeopleServiceImpl(PeopleRepository peopleRepository, UtilityService utilityService) {
        this.peopleRepository = peopleRepository;
        this.utilityService = utilityService;
    }

    public ArrayList<People> getPeople() {
        var people = peopleRepository.getPeople();
        return utilityService.sortPeopleByAge(people);
    }
}
