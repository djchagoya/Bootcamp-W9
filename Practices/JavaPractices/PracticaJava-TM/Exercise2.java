package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
    public static boolean isMultiple(int n, int m) {
        return n % m == 0;
    }

    public static void main(String[] args) {
        int number;
        int m;
        boolean Follow;
        do {
            try {
                Follow = false;
                System.out.println("Enter the n");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                System.out.println("Enter the m");
                m= scanner.nextInt();
                for(int i =1; i < m; i++)
                if (isMultiple(number,i)) {
                    System.out.println("This " + i + " is multiple");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Not a number");
                Follow = true;
            }
        } while (Follow);
    }

}
