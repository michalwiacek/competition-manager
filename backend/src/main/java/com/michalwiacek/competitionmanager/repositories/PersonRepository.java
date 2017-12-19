package com.michalwiacek.competitionmanager.repositories;

import com.michalwiacek.competitionmanager.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    //List<Person> findByNameAndSurname(@Param("name") String name, @Param("surname") String surname);
    //List <Person> findAll();
}
