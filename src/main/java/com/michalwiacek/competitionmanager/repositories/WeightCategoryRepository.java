package com.michalwiacek.competitionmanager.repositories;

import com.michalwiacek.competitionmanager.entities.WeightCategory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WeightCategoryRepository extends JpaRepository<WeightCategory, Long> {
}
