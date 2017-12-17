package com.michalwiacek.competitionmanager.repositories;

import com.michalwiacek.competitionmanager.entities.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AthleteRepository extends JpaRepository <Athlete, Long> {

    Athlete getByNameAndSurname(String name,String surname);
    List<Athlete> findAll();
}
