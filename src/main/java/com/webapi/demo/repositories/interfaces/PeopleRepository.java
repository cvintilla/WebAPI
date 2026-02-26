package com.webapi.demo.repositories.interfaces;

import com.webapi.demo.models.People;

import java.util.ArrayList;

public interface PeopleRepository {
    public ArrayList<People> getPeople();
}
