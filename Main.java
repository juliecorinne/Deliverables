package com.company;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        int year1;
        int year2;
        int month1;
        int month2;
        int day1;
        int day2;
        int date1;
        int date2;
        int durationDifference;



            year1 = 0;
            year2 = 0;
            month1 = 0;
            month2 = 0;
            day1 = 0;
            day2 = 0;


            // prompt for input

            System.out.println("Enter the first date: (format -> " + day1 + "/ " + month1 + "/ " + year1 + ")");

            Scanner scanner = new Scanner(System.in);
            // read the 1st input

            year1 = scanner.nextInt();
            month1 = scanner.nextInt();
            day1 = scanner.nextInt();

            // prompt for input

            System.out.println("Enter the second date: (format -> " + day2 + "/ " + month2 + "/ " + year2 + ")");

            // read the 2nd input

            year2 = scanner.nextInt();
            month2 = scanner.nextInt();
            day2 = scanner.nextInt();

        // convert the input to days

        date1 = ((year1 * 365) + (month1 * 30)) + day1;
        date2 = ((year2 * 365) + (month2 * 30)) + day2;

        durationDifference = date2 - date1;

        // convert back

        int years = durationDifference / 365;
        int months = (durationDifference % 365) / 30;
        int days = (durationDifference % 365) % 30;

        // output the difference

        System.out.println("Difference is: " + days + " days, " + months + "months and " + years + " years.");

    }
}

