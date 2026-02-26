package com.webapi.demo.services.interfaces;

import com.webapi.demo.models.People;

import java.util.ArrayList;

public interface UtilityService {
    public ArrayList<People> sortPeopleByAge(ArrayList<People> unsortedPeople);
}
