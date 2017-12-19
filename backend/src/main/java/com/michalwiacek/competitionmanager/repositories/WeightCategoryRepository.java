package com.michalwiacek.competitionmanager.repositories;

import com.michalwiacek.competitionmanager.domain.WeightCategory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WeightCategoryRepository extends JpaRepository<WeightCategory, Long> {
}
