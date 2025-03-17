package com.rvg.patterns.frontcontroller;

/**
 * The StudentVO class represents a simple value object that holds the student's ID and name.
 */
public class StudentVO {

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

    public StudentVO(int i, String name) {
        this.id = i;
        this.name = name;
    }

}
