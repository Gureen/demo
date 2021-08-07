package com.company;
abstract class Employee {
    private long id;
    private String name;
    private int workingHours;


    public Employee(String name, int workingHours) {
        long count = 1;
        this.id = count++;
        this.name = name;
        this.workingHours = workingHours;
    }

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    abstract boolean addWorker();

    abstract void show();

    abstract void remove();

    abstract void exit();

}
