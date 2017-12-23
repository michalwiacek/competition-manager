package com.michalwiacek.tournamentmanager.entities.person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    //List<Person> findByNameAndSurname(@Param("name") String name, @Param("surname") String surname);
    //
}
