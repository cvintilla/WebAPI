package com.webapi.demo.controller;

import com.webapi.demo.models.People;
import com.webapi.demo.services.PeopleServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PeopleController {

    private final PeopleServiceImpl peopleServiceImpl;

    public PeopleController(PeopleServiceImpl peopleServiceImpl) {
        this.peopleServiceImpl = peopleServiceImpl;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<People> getPeople() {

        return this.peopleServiceImpl.getPeople();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public String createPeople() {

        return "test";
    }
}
