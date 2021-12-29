package com.cos.blogactionaws.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class BlogControllerTest {
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void home() {
		ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);
		assertEquals("<h1>jar 배포 V2</h1>", response.getBody());
	}
}
