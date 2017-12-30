package com.michalwiacek.tournamentmanager;

import com.michalwiacek.tournamentmanager.security.Role;
import com.michalwiacek.tournamentmanager.security.RoleType;
import com.michalwiacek.tournamentmanager.security.User;
import com.michalwiacek.tournamentmanager.security.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class)
public class TournamentManagerApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(
			TournamentManagerApplication.class);

	@Autowired
	UserRepository userRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(TournamentManagerApplication.class, args);
	}


	@Override
	public void run(String... strings) throws Exception {
		Arrays.stream(RoleType.values()).forEach(x -> {
			String name = x.name().split("_")[1].toLowerCase();

			User user = new User();
			user.setUsername(name);
			user.setPassword(passwordEncoder.encode("1234"));

			Role role = new Role();
			role.setType(x);
			role.setUser(user);

			user.setRoles(Arrays.asList(role));
			userRepository.save(user);
		});
	}
}