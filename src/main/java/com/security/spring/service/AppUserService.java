package com.security.spring.service;

import java.sql.SQLException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.spring.domain.AppUser;
import com.security.spring.domain.Role;
import com.security.spring.repo.AppUserRepository;
import com.security.spring.repo.RoleRepository;

import lombok.SneakyThrows;
import lombok.val;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional(rollbackOn = { SQLException.class, Exception.class })
@Slf4j
public class AppUserService implements UserDetailsService {

	@Autowired
	private AppUserRepository appUserRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	@SneakyThrows(UsernameNotFoundException.class)
	public UserDetails loadUserByUsername(String phone) {

		val appUser = appUserRepository.findByPhone(phone);

		if (Optional.ofNullable(appUser).isPresent()) {

			log.info("user {} is available in the database", phone);

			Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();

			appUser.getRoles().forEach(role -> {

				authorities.add(new SimpleGrantedAuthority(role.getName()));
			});

			return new org.springframework.security.core.userdetails.User(appUser.getPhone(), appUser.getPassword(),
					authorities);

		} else {

			log.info("user {} is not available in the database", phone);
			throw new UsernameNotFoundException("user " + phone + " is not available in the database");
		}
	}

	@SneakyThrows(Exception.class)
	public AppUser saveUser(AppUser appUser) {

		log.info("saving new user {} to the database", appUser.getName());

		appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));

		return appUserRepository.save(appUser);
	}

	@SneakyThrows(Exception.class)
	public Role saveRole(Role role) {

		log.info("saving new role {} to the database", role.getName());

		return roleRepository.save(role);
	}

	@SneakyThrows(Exception.class)
	public void addRoleToUser(String phone, String roleName) {

		log.info("adding role {} to user {}", roleName, phone);

		val appUser = appUserRepository.findByPhone(phone);
		val role = roleRepository.findByName(roleName);

		appUser.getRoles().add(role);
	}

	@SneakyThrows(Exception.class)
	public AppUser getUser(String phone) {

		log.info("getting user{} from the database", phone);

		return appUserRepository.findByPhone(phone);
	}

	@SneakyThrows(Exception.class)
	public List<AppUser> getUsers() {

		log.info("getting all users from the database");

		return appUserRepository.findAll();
	}

	@SneakyThrows(Exception.class)
	public ResponseEntity<Object> getInfo(HttpServletRequest request) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		String authorizationHeader = request.getHeader("Authorization");
		String accessToken = authorizationHeader.substring("Bearer ".length());
		Algorithm algorithm = Algorithm.HMAC256("secret".getBytes());
		JWTVerifier verifier = JWT.require(algorithm).build();
		DecodedJWT decodedJWT = verifier.verify(accessToken);
		String phone = decodedJWT.getSubject();
		Map<String, Object> data = new HashMap<String, Object>();
		Map<String, Object> userData = new HashMap<String, Object>();
		userData.put("phone", phone);
		data.put("data", userData);

		return ResponseEntity
				.status(HttpStatus.OK)
				.headers(headers)
				.body(data);
	}

}
