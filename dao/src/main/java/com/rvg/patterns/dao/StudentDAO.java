/**
 * Interface representing the Data Access Object (DAO) for Student entities.
 * Provides methods to perform CRUD operations on Student objects.
 */
package com.rvg.patterns.dao;

public interface StudentDAO {

    void create(Student student);

    void delete(int id);
}
