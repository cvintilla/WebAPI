package com.webapi.demo.repositories;

import com.webapi.demo.models.People;
import com.webapi.demo.repositories.interfaces.PeopleRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PeopleRepositoryImpl implements PeopleRepository {

    // generates random number of people
    public ArrayList<People> getPeople() {
        ArrayList<People> people = new ArrayList<People>();
        var randomUtil = new java.util.Random();
        var maxNumber = 1 + randomUtil.nextInt(1, 10);

        for (int i = 0; i < maxNumber; i++) {
            var person = new People();
            person.setAge(i);
            person.setFirstName(FIRSTNAMES.get(i));
            person.setLastName(LASTNAMES.get(i));

            people.add(person);
        }
        return people;
    }

    private static final List<String> FIRSTNAMES = List.of(
            "Christian", "Evan", "Madison", "Olivia", "Liam",
            "Noah", "Ava", "Sophia", "Mason", "Emma"
    );

    private static final List<String> LASTNAMES = List.of(
            "Vintilla", "Bates", "Chock", "Smith", "Johnson",
            "Brown", "Davis", "Miller", "Wilson", "Anderson"
    );
}

