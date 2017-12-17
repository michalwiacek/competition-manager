package com.michalwiacek.competitionmanager.repositories;

import com.michalwiacek.competitionmanager.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
