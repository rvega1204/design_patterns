package com.rvg.patterns.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Implementation of the StudentDAO interface using Spring's JdbcTemplate.
 * This class provides methods to perform CRUD operations on the student table.
 * 
 * @Repository - Indicates that this class is a repository and a candidate for Spring's component scanning.
 */
@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * Inserts a new student record into the student table.
     * 
     * @param student - The student object containing the details to be inserted.
     */
    @Override
    public void create(Student student) {
        String sql = "insert into student (id, name, testScore) values(?, ?, ?)";
        jdbcTemplate.update(sql, student.getId(), student.getName(), student.getTestScore());
    }

    /**
     * Deletes a student record from the student table based on the given id.
     * 
     * @param id - The id of the student to be deleted.
     */
    @Override
    public void delete(int id) {
        String sql = "delete from student where id = ?";
        jdbcTemplate.update(sql, id);
    }
}
