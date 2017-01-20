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

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first date month: ");
            month1 = scanner.nextInt();
            //input first date

            System.out.println("Enter the first date day: ");
            day1 = scanner.nextInt();

            System.out.println("Enter the first date day: ");
            year1 = scanner.nextInt();


            System.out.println("Enter the second date month: ");
            month2 = scanner.nextInt();
            //input second date

            System.out.println("Enter the second date day: ");
            day2 = scanner.nextInt();

            System.out.println("Enter the second date year: ");
            year2 = scanner.nextInt();

        // convert the input to days between dates

        date1 = ((year1 * 365) + (month1 * 30)) + day1;
        date2 = ((year2 * 365) + (month2 * 30)) + day2;

        durationDifference = date2 - date1;

        // convert back to how many years, months, days in between two dates

        int years = durationDifference / 365;
        int months = (durationDifference % 365) / 30;
        int days = (durationDifference % 365) % 30;

        // output the difference

        System.out.println("Difference is: " + days + " days, " + months + " months, and " + years + " years.");

    }
}

