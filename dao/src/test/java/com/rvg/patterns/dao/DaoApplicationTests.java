/**
 * This class contains test cases for the DAO (Data Access Object) pattern implementation.
 * It uses Spring Boot's testing support to load the application context and perform tests.
 * 
 * The class tests the creation and deletion of Employee and Student entities using their respective DAOs.
 * 
 * Annotations:
 * - @SpringBootTest: Indicates that the context under test is a Spring Boot application context.
 * - @Autowired: Marks a dependency to be injected by Spring's dependency injection.
 * 
 * Test Methods:
 * - testCreate(): Tests the creation and deletion of Employee and Student entities.
 * 
 * Dependencies:
 * - EmployeeDAO: DAO for Employee entities.
 * - StudentDAO: DAO for Student entities.
 */
package com.rvg.patterns.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DaoApplicationTests {

	@Autowired
	EmployeeDAO dao;

	@Autowired
	StudentDAO sDao;

	@Test
	void testCreate() {
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("Bob");
		dao.create(employee);

		dao.delete(2);

		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Jhon");
		student1.setTestScore(5);
		sDao.create(student1);

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Bob");
		student2.setTestScore(3);
		sDao.create(student2);

		sDao.delete(2);
	}

}
