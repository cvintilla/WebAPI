package com.webapi.demo.controller;

import com.webapi.demo.models.People;
import com.webapi.demo.services.PeopleServiceImpl;
import com.webapi.demo.services.interfaces.PeopleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PeopleController {

    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<People> getPeople() {
        return peopleService.getPeople();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public String createPeople() {
        return "test";
    }
}
