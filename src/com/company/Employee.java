package com.company;

import java.util.UUID;

abstract class Employee {
    private String id;
    private String name;
    private int workingHours;

    public Employee(String name, int workingHours) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.workingHours = workingHours;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHors(int workingHours) {
        this.workingHours = workingHours;
    }




    abstract void remove();

    abstract void exit();

}
