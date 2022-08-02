package com.ecommerce.ecommerce;

import com.ecommerce.ecommerce.model.Product;
import com.ecommerce.ecommerce.model.User;
import com.ecommerce.ecommerce.repository.ProductRepository;
import org.aspectj.lang.annotation.Before;
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
class ProductServiceTests {

	@Autowired
	private ProductRepository productRepository;

	@Test
	@Order(1)
	public void testCreateProduct() {
		Product product = new Product();

		product.setName("Sabun Lifebuoy");
		product.setPrice(new Long(50));

		Product res = productRepository.save(product);
		assertNotNull(res);
	}

	@Test
	@Order(2)
	public void testGetProduct() {
		Product res = productRepository.findByName("Sabun Lifebuoy");
		assertEquals("Sabun Lifebuoy", res.getName().trim());
	}

	@Test
	@Order(3)
	public void testGetProducts() {
		List<Product> res = productRepository.findAll();
		assertThat(res).size().isGreaterThan(0);
	}

	@Test
	@Order(4)
	public void testUpdateProduct() {
		Product product = productRepository.findByName("Sabun Lifebuoy");

		product.setName("Shampoo Lifebuoy");
		product.setPrice(new Long(60));

		Product res = productRepository.save(product);
		assertEquals("Shampoo Lifebuoy", res.getName().trim());
	}

	@Test
	@Order(5)
	public void testDeleteStudent() {
		Product product = productRepository.findByName("Sabun Lifebuoy");
		productRepository.delete(product);
		assertNull(productRepository.findByName("Sabun Lifebuoy"));
	}
}