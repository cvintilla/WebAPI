package com.webapi.demo.services;

import com.webapi.demo.models.People;
import com.webapi.demo.repositories.interfaces.PeopleRepository;
import com.webapi.demo.services.interfaces.PeopleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PeopleServiceImpl implements PeopleService {

    private final PeopleRepository peopleRespository;

    public PeopleServiceImpl(PeopleRepository peopleRespository) {
        this.peopleRespository = peopleRespository;
    }

    public ArrayList<People> getPeople() {
        return peopleRespository.getPeople();
    }
}
