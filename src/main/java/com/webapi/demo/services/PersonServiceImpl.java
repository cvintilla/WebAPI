package com.webapi.demo.services;

import com.webapi.demo.models.Person;
import com.webapi.demo.repositories.interfaces.PersonRepository;
import com.webapi.demo.services.interfaces.PersonService;
import com.webapi.demo.services.interfaces.UtilityService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepo;
    private final UtilityService utilityService;

    public PersonServiceImpl(PersonRepository personRepo, UtilityService utilityService) {
        this.personRepo = personRepo;
        this.utilityService = utilityService;
    }

    @Override
    public ArrayList<Person> getPeople() {
        var people = personRepo.findAll();
        return utilityService.sortPeopleByAge(people);
    }

    @Override
    public Person create(Person person) {
        return personRepo.save(person);
    }

    @Override
    public Person update(Long id, Person updatedPerson) {
        var existingOpt = personRepo.findById(id);
        if (existingOpt.isEmpty()) {
            return null;
        }

        var existing = existingOpt.get();
        existing.setFirstName(updatedPerson.getFirstName());
        existing.setLastName(updatedPerson.getLastName());
        existing.setAge(updatedPerson.getAge());

        return personRepo.save(existing);
    }

    @Override
    public boolean deleteById(Long id) {
        if (!personRepo.existsById(id)) {
            return false;
        }
        personRepo.deleteById(id);
        return true;

    }
}
