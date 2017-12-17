package com.michalwiacek.competitionmanager.repositories;

import com.michalwiacek.competitionmanager.entities.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface CompetitionRepository extends JpaRepository<Competition,Long>{
    List<Competition> findByName(@Param("name") String name);
    List<Competition> findBYDate(@Param("date") LocalDate date);
}
