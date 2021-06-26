package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {

    public static boolean isPrime(int n) {
        int a = 0;
        boolean isPrimeNumber = false;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){a++;}
            if (a == 2) {
                isPrimeNumber = true;
            } else {
                isPrimeNumber = false;
            }
        }
        return isPrimeNumber;

    }

    public static void main(String[] args) {
        int number;
        int m;
        boolean Follow;
        do {
            try {
                Follow = false;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the n");
                number = scanner.nextInt();
                for (int i = 1; i <= number; i++)
                    if (isPrime(i)) {
                        System.out.println(" " + i + ",");
                    }

            } catch (InputMismatchException ex) {
                System.out.println("Not a number");
                Follow = true;
            }
        } while (Follow);
    }

}
