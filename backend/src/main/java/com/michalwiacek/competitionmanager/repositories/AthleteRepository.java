package com.michalwiacek.competitionmanager.repositories;

import com.michalwiacek.competitionmanager.domain.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AthleteRepository extends JpaRepository<Athlete, Long> {

    List<Athlete> getByNameAndSurname(@Param("name")String name,@Param("surname") String surname);
    //List<Athlete> findAll();
}
