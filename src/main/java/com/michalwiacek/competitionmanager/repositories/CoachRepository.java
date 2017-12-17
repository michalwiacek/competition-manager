package com.michalwiacek.competitionmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.michalwiacek.competitionmanager.entities.Coach;

import java.util.List;

public interface CoachRepository extends JpaRepository<Coach, Long>{
    Coach getByNameAndSurname(String name, String surname);
    List<Coach> findAll();
}
