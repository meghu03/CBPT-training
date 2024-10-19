package com.example.springweb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import com.example.springweb.entities.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductrestapiApplicationTests {

	@Test
	public void testGetProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8080/products/2",Product.class);	
		assertNotNull(product);
		assertEquals("Mac book pro", product.getName());
		
	}

}
