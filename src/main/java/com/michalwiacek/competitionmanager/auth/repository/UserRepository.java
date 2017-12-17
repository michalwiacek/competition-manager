package com.michalwiacek.competitionmanager.auth.repository;

import com.michalwiacek.competitionmanager.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
