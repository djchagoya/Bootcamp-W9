package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise5 {

    public static void isPrime(int n, int m, int d) {

        int a = 0;

        int nAccountant = 0;
        int accountant = 1;
        String dd = String.valueOf(d);


        do {

            String numberCast = String.valueOf(accountant);
            for (int j = 0; j < numberCast.length(); j++) {
                if(numberCast.charAt(j) == dd.charAt(0))
                {a++;}
            }
            if (a == m) {
                System.out.println(accountant);
                nAccountant++;
            }
            a = 0;
            accountant++;
        } while (!(n == nAccountant));

    }

    public static void main(String[] args) {
        int number;
        int mInput = 0;
        int dInput = 0;
        boolean follow;
        do {
            try {
                follow = false;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the n");
                number = scanner.nextInt();
                System.out.println("Enter m");
                mInput = scanner.nextInt();
                System.out.println("Enter d");
                dInput = scanner.nextInt();

                isPrime(number, mInput, dInput);

            } catch (InputMismatchException ex) {
                System.out.println("Not a number");
                follow = true;
            }
        } while (follow);
    }

}
