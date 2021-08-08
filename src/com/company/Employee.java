package com.company;

import java.util.ArrayList;
import java.util.UUID;

abstract class Employee {

    static ArrayList<Employee> listOfEmployees = new ArrayList<>();


    private String id;
    private String name;
    private int workingHours;
    private int salary;

    public Employee(String name, int workingHours) {
        this.salary = salary;
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.workingHours = workingHours;
    }

    public Employee() {
    }


    public static ArrayList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public static void setListOfEmployees(ArrayList<Employee> listOfEmployees) {
        Employee.listOfEmployees = listOfEmployees;
    }

    public int getSalary() {
        return salary;
    }

    public int setSalary(int salary) {
        this.salary = salary;
        return salary;
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


    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", workingHours=" + workingHours +
                ", salary=" + salary +
                '}';
    }

    abstract int calculateSalary();

}
