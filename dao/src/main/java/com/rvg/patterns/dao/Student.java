/**
 * Represents a student with an ID, name, and test score.
 * This class provides getter and setter methods to access and modify the student's details.
 */
package com.rvg.patterns.dao;

public class Student {

    private int id;
    private String name;
    private int testScore;
    
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

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }
}
