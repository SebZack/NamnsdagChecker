package com.sebzack;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Would you like to check a 1. date or 2. name");
        Scanner modeInput = new Scanner(System.in);
        int mode = modeInput.nextInt();


        if (mode == 1) {
            // block of code to be executed if the condition is true
            System.out.println("You printed 1!");
            Main.checkDateOfName();
        }
        if (mode == 2) {
            System.out.println("You printed 2!");
            Main.checkNameOfDate();
        }
        if (mode >= 3) {
            System.out.println("You didn't print 1 or 2. Please try again");
        }

    }

    public static void checkDateOfName() {
        System.out.println("Please enter a date");
        Scanner dateInput = new Scanner(System.in);
        int date = dateInput.nextInt();


    }
    public static void checkNameOfDate() {
        System.out.println("Oh fuck you again");

    }

}