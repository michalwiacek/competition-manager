package com.michalwiacek.tournamentmanager.entities.tournament;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TournamentRepository extends JpaRepository<Tournament,Long>{
    List<Tournament> findByName(@Param("name") String name);
    //List<Tournament> findBYDate(@Param("date") LocalDate date);
}
