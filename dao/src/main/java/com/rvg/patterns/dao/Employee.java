/**
 * The Employee class represents an employee with an id and a name.
 * It provides getter and setter methods to access and modify the employee's id and name.
 * author rvega
 */
package com.rvg.patterns.dao;

public class Employee {

    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
