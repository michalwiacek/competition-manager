package com.michalwiacek.competitionmanager.repositories;

import com.michalwiacek.competitionmanager.entities.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AthleteRepository extends JpaRepository <Athlete, Long> {
}
