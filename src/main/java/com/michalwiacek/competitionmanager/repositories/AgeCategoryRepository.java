package com.michalwiacek.competitionmanager.repositories;

import com.michalwiacek.competitionmanager.entities.AgeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgeCategoryRepository extends JpaRepository<AgeCategory, Long> {
}
