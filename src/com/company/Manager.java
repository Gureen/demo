package com.company;

import java.util.ArrayList;
import java.util.Scanner;


    public class Manager extends Employee {
        static ArrayList<Employee> listOfEmployees = new ArrayList<>();

        public Manager(String name, int workingHours) {
            super(name, workingHours);
        }

        public Manager() {

        }

        static void addManager() {

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




                Employee newEmployee = new Manager(nameScan, whScan);
                listOfEmployees.add(newEmployee);
            }
        }


        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        int calculateSalary() {
            return getWorkingHours() * 10;
        }
    }


