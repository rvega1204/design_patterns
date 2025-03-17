package com.rvg.patterns.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * This is the test class for the Inversion of Control pattern.
 * The Customer dependency is injected using the @Autowired annotation.
 * The pay method is called to test the payment functionality.
 */
@SpringBootTest
class IocApplicationTests {

	@Autowired
	Customer customer;

	@Test
	void testPayment() {
		customer.pay();
	}

}
