package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise3 {
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
        boolean Follow;
        do {
            try {
                System.out.println("Enter the number to evaluate");
                Scanner scanner = new Scanner(System.in);
                Follow = false;
                number = scanner.nextInt();
                if (isPrime(number)) {
                    System.out.println("This " + number + " is a prime number ");
                } else {
                    System.out.println("This " + number + " is not a prime number ");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Not a number");
                Follow = true;
            }
        } while (Follow);
    }
}
