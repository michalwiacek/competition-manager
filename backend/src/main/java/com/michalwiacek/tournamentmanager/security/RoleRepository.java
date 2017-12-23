package com.michalwiacek.tournamentmanager.security;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {

    List<Role> findByUserId(Long userId);
}
