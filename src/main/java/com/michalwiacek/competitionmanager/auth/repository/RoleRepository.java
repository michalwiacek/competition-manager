package com.michalwiacek.competitionmanager.auth.repository;

import com.michalwiacek.competitionmanager.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
