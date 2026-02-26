package com.webapi.demo.repositories.interfaces;

import com.webapi.demo.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

///  person repository
public interface PersonRepository extends JpaRepository<Person, Long> { }
