package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SupplementaryExercise4 {
    public static void getInformation() {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isEven(number)+" that the number is divisible by 2");
    }
    public static boolean isEven(int number) {
        return number%2==0 ? true : false;
    }
    public static void main(String[] args) {
        getInformation();
    }
}
