package com.company;
import java.util.Scanner;

class Main {

        public static void main(String[] args)

        {
            int n, reverse = 0;

            System.out.println("Enter the number you would like to reverse: ");

            //input number

            Scanner in = new Scanner(System.in);

            n = in.nextInt();

            while( n != 0 )

            {
                reverse = reverse * 10;

                reverse = reverse + n % 10;

                n = n / 10;
            }

            System.out.println("Reverse of entered number is "+reverse);
            //output number

        }

    }


