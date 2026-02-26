package com.webapi.demo.services.interfaces;

import com.webapi.demo.models.People;

import java.util.List;

public interface UtilityService {
    public List<People> sortPeopleByAge(List<People> unsortedPeople);
}
