package com.michalwiacek.competitionmanager.repositories;

import com.michalwiacek.competitionmanager.entities.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitionRepository extends JpaRepository<Competition,Long>{

}
