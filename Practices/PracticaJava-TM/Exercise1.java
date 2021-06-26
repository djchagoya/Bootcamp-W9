package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static boolean isEven(int n) {
        return n % 2 == 0;
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
                if (isEven(number)) {
                    System.out.println("This " + number + " is a even number ");
                } else {
                    System.out.println("This " + number + " is not a even number ");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Not a number");
                Follow = true;
            }
        } while (Follow);
    }
}
