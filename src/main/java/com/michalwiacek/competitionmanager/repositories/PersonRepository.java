package com.michalwiacek.competitionmanager.repositories;

import com.michalwiacek.competitionmanager.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByNameAndSurname(@Param("name") String name, @Param("surname") String surname);
    List<Person> findAll();
}
