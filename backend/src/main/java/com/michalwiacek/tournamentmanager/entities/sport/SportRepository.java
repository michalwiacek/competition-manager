package com.michalwiacek.tournamentmanager.entities.sport;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SportRepository extends JpaRepository<Sport, Long> {
    List<Sport> getByName(@Param("name") String name);
}
