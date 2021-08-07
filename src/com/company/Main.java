package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.print("Hello, user!\n" +
                "Please enter command:");

        Scanner newScan = new Scanner(System.in);

        while (true) {

            String input = newScan.nextLine();

            switch (input) {
                case "add w":

                    Worker.addWorker();

                   if(true){

                       System.out.print("Hello, user!\n" +
                               "Please enter command:");
                       continue;

                   }

                case "show":
                   Worker.show();

                   System.out.print("\nPlease input next command:\n");

                    continue;

                case "remove":
                  Worker.remove();

                    System.out.print("\nPlease input next command:\n");

                    continue;
                case "search":

                    Worker.searchEmployee();

                    System.out.print("\nPlease input next command:\n");
                    continue;

                case "exit":
                          Worker exitCase = new Worker();
                          exitCase.exit();

                default:
                    System.out.print("Wrong input! Please use one of the following commands!\n"
                            + "add w\n" + "add m\n" + "show\n" + "remove\n" + "search\n" + "exit\n"
                            + "New input command:");

            }


        }
    }
        }



