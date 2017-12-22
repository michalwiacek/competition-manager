package com.michalwiacek.tournamentmanager.entities.club;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClubRepository extends JpaRepository<Club, Long> {
    List<Club> getByName(@Param("name") String name);
    //List<Club> findAll();
}
