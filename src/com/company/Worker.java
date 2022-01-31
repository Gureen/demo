package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Worker extends Employee {



    public Worker(String name, int workingHours) {
        super(name, workingHours);
    }

    public Worker() {

    }

    static void addWorker() {

        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Employee entry started! \n " + "Please enter employee name:");

            while (!scan.hasNext("[A-Za-z]+")) {
                System.out.println(" Numbers are not allowed.Try again: ");
                scan.nextLine();
            }

            String nameScan = scan.nextLine();

            if (nameScan.equals("end")) {
                return;
            }

            System.out.print("Please enter employee working hours:");
            int whScan = scan.nextInt();



            while (whScan < 0 || whScan > 40) {
                System.out.print("Please input working hours between 0 - 40: \n");
                whScan = scan.nextInt();


            }


            Employee newEmployee = new Worker(nameScan, whScan);
            newEmployee.calculateSalary();
            listOfEmployees.add(newEmployee);
        }
    }


    static void show() {


        System.out.print(getSortedByName());


    }


   static ArrayList<Employee> getSortedByName() {
      listOfEmployees.sort(Comparator.comparing(Employee::getName));
       return listOfEmployees;
    }

    static void remove() {

        System.out.print(" Please enter the name of user you want to delete:\n");
        Scanner removeByName = new Scanner(System.in);
        String userInput = removeByName.nextLine();


        for (int i = 0; i < listOfEmployees.size(); i++) {
            if (listOfEmployees.get(i).getName().equals(userInput)) {
                listOfEmployees.remove(i);
                System.out.print("Employee was removed!: \n");
                continue;

            }
        }
    }


    static void searchEmployee() {
        Scanner searchBar = new Scanner(System.in);
        System.out.println("Enter employee name");
        String search = searchBar.nextLine();

        for (Employee employee : listOfEmployees) {
            if (employee.getName().equals(search)) {
                System.out.println( employee.getName() + " worked " + employee.getWorkingHours() + " hours this week.");
            } else {
                System.out.println(search + " doesn't exist, please add employee first.");
            }

        }
    }




    void exit() {
      System.exit(0);
    }



    @Override
    public int calculateSalary() {

      int salary =  getWorkingHours() * 10;


        return setSalary(salary);
    }


}
