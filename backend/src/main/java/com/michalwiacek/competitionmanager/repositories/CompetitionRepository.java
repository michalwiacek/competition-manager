package com.michalwiacek.competitionmanager.repositories;

import com.michalwiacek.competitionmanager.domain.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompetitionRepository extends JpaRepository<Competition,Long>{
    List<Competition> findByName(@Param("name") String name);
    //List<Competition> findBYDate(@Param("date") LocalDate date);
}
