package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise5 {

    public static void isPrime(int n, int m, int d) {
        int a = 0;
        String dd = String.valueOf(d);
        String mm = String.valueOf(m);
        String numberCast = String.valueOf(n);
        for (int j = 0; j < numberCast.length(); j++) {
            if(numberCast.charAt(j) == dd.charAt(0))
            {a++;}
        }
        if (a == m) {
            System.out.println(n);
        }

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

                for (int i = 1; i < number; i++) {
                    isPrime(i, mInput, dInput);
                }
            } catch (InputMismatchException ex) {
                System.out.println("Not a number");
                follow = true;
            }
        } while (follow);
    }

}
