package com.security.spring.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.spring.service.AppUserService;

import lombok.SneakyThrows;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/v2/auth")
@Slf4j
public class UserResource {

	@Autowired
	private AppUserService appUserService;

	@SneakyThrows(Exception.class)
	@GetMapping("/info")
	public ResponseEntity<Object> getInfo(HttpServletRequest request) {
		log.info("GET /v2/auth/info is executed...");
		return appUserService.getInfo(request);
	}

}
