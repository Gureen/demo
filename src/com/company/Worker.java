package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Worker extends Employee {
    static ArrayList<Worker> arrayList;

    public Worker(String name, int workingHours) {
        super(name, workingHours);
    }

    public Worker() {

    }


     static boolean addWorker() {


        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Employee entry started! \n " + "Please enter employee name:");

            while (!scan.hasNext("[A-Za-z]+")) {
                System.out.println(" Numbers are not allowed.Try again: ");
                scan.nextLine();
            }

            String nameScan = scan.nextLine();

            if (nameScan.equals("end")) {
                return true;
            }


            System.out.print("Please enter employee working hours:");
            int whScan = scan.nextInt();

            while(whScan < 0 || whScan > 40){
              System.out.print("Please input working hours between 0 - 40: \n");
               whScan = scan.nextInt();
            }


            ArrayList<Worker> listOfWorkers = new ArrayList<>();
                Worker newWorker = new Worker(nameScan, whScan);
                listOfWorkers.add(newWorker);
            }
        }



    @Override
    void show() {

        System.out.print(arrayList);

    }

    @Override
    void remove() {

    }

    @Override
    void exit() {
      System.exit(0);
    }
}
