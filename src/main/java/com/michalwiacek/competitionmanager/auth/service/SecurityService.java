package com.michalwiacek.competitionmanager.auth.service;

public interface SecurityService {

    String findLoggedInUsername();

    void autologin(String username, String password);
}
