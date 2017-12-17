package com.michalwiacek.competitionmanager.repositories;

import com.michalwiacek.competitionmanager.entities.Club;
import org.checkerframework.checker.units.qual.C;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClubRepository extends JpaRepository<Club, Long> {
    Club getByName(String name);
    List<Club> findAll();
}
