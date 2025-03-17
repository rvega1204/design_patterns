/**
 * Implementation of the EmployeeDAO interface using Spring's JdbcTemplate.
 * This class provides methods to perform CRUD operations on the Employee table.
 * 
 * <p>It uses the {@link JdbcTemplate} to interact with the database.</p>
 * 
 * <p>Methods:</p>
 * <ul>
 *   <li>{@link #create(Employee)} - Inserts a new employee record into the database.</li>
 *   <li>{@link #delete(int)} - Deletes an employee record from the database based on the employee ID.</li>
 * </ul>
 * 
 * <p>Annotations:</p>
 * <ul>
 *   <li>{@link Repository} - Indicates that this class is a Spring repository bean.</li>
 *   <li>{@link Autowired} - Injects the JdbcTemplate bean into this class.</li>
 * </ul>
 * 
 * @see EmployeeDAO
 * @see JdbcTemplate
 */
package com.rvg.patterns.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public void create(Employee employee) {
        String sql = "insert into employee values(?,?)";
        jdbcTemplate.update(sql, employee.getId(), employee.getName());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from employee where id = ?";
        jdbcTemplate.update(sql, id);
    }

}
