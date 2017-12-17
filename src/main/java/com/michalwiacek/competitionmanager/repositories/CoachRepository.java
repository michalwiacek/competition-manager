package com.michalwiacek.competitionmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.michalwiacek.competitionmanager.entities.Coach;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CoachRepository extends JpaRepository<Coach, Long>{
    List<Coach> getByNameAndSurname(@Param("name")String name, @Param("surname") String surname);
    //List<Coach> findAll();
}
