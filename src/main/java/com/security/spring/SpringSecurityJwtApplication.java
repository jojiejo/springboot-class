package com.security.spring;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.security.spring.domain.AppUser;
import com.security.spring.domain.Role;
import com.security.spring.service.AppUserService;

@SpringBootApplication
public class SpringSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(AppUserService appUserService) {

		return args -> {

			appUserService.saveUser(new AppUser(null, "Djodi Ramadhan", "082124980009", "djodi123", new ArrayList<>()));
			appUserService.saveUser(new AppUser(null, "Citra Widya", "082124980008", "citra123", new ArrayList<>()));
			appUserService.saveUser(new AppUser(null, "Wendy Grace", "082124980007", "wendy123", new ArrayList<>()));
			appUserService.saveUser(new AppUser(null, "Luqman Alfarisi", "082124980006", "luqman123", new ArrayList<>()));

			appUserService.saveRole(new Role(null, "ROLE_USER"));
			appUserService.saveRole(new Role(null, "ROLE_MANAGER"));
			appUserService.saveRole(new Role(null, "ROLE_ADMIN"));
			appUserService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			appUserService.addRoleToUser("082124980009", "ROLE_USER");
			appUserService.addRoleToUser("082124980008", "ROLE_MANAGER");
			appUserService.addRoleToUser("082124980007", "ROLE_ADMIN");
			appUserService.addRoleToUser("082124980006", "ROLE_SUPER_ADMIN");
		};
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
