package com.michalwiacek.competitionmanager.auth.service;

import com.michalwiacek.competitionmanager.auth.model.User;

public interface UserService {
    void save(User userForm);

    User findByUsername(String username);
}
