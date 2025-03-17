package com.rvg.patterns.dao;

/**
 * EmployeeDAO is an interface that defines the data access operations 
 * for Employee objects. It provides methods to create and delete 
 * Employee records in the data source.
 */
public interface EmployeeDAO {

    void create(Employee employee);

    void delete(int id);
}
