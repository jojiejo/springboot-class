package com.ecommerce.ecommerce;

import com.ecommerce.ecommerce.model.User;
import com.ecommerce.ecommerce.repository.UserRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserServiceTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	@Order(1)
	public void testCreateUser() {
		User user = new User();

		user.setUserName("Djodi Ramadhan");
		user.setAddress("Jakarta");
		user.setPhone("082124980009");

		User res = userRepository.save(user);
		assertNotNull(res);
	}

	@Test
	@Order(2)
	public void testGetUser() {
		User res = userRepository.findByUserName("Djodi Ramadhan");
		assertEquals("Djodi Ramadhan", res.getUserName().trim());
	}

	@Test
	@Order(3)
	public void testGetUsers() {
		List<User> res = userRepository.findAll();
		assertThat(res).size().isGreaterThan(0);
	}

	@Test
	@Order(4)
	public void testUpdateStudent() {
		User user = userRepository.findByUserName("Djodi Ramadhan");

		user.setUserName("Bukan Djodi");
		user.setAddress("Bekasi");
		user.setPhone("082124980001");

		User res = userRepository.save(user);
		assertEquals("Bukan Djodi", res.getUserName().trim());
	}

	@Test
	@Order(5)
	public void testDeleteStudent() {
		User user = userRepository.findByUserName("Djodi Ramadhan");
		userRepository.delete(user);
		assertNull(userRepository.findByUserName("Djodi Ramadhan"));
	}
}