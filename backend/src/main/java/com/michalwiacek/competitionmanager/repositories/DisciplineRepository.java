package com.michalwiacek.competitionmanager.repositories;

import com.michalwiacek.competitionmanager.domain.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DisciplineRepository extends JpaRepository<Discipline, Long> {
    List<Discipline> getByName(@Param("name") String name);
}
