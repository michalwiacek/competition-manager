package com.michalwiacek.tournamentmanager.entities.person;

import com.michalwiacek.tournamentmanager.entities.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    //List<Person> findByNameAndSurname(@Param("name") String name, @Param("surname") String surname);
    //List <Person> findAll();
}
