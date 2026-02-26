package com.webapi.demo.services;

import com.webapi.demo.models.Person;
import com.webapi.demo.models.PersonRequest;
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
    public Person create(PersonRequest request) {
        var createdPerson = new Person(request.firstName, request.lastName, request.age);
        return personRepo.save(createdPerson);
    }

    @Override
    public Person update(Long id, PersonRequest request) {
        var updatedPerson = new Person(request.firstName, request.lastName, request.age);
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

    private Person MapRequest(PersonRequest personRequest) {
        return new Person(personRequest.firstName, personRequest.lastName, personRequest.age);
    }
}
