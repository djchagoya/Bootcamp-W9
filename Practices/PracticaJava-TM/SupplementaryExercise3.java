package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SupplementaryExercise3 {
    public static void getInformation() {
        System.out.println("Enter the radius");
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("The area of the circle is " + df.format(calculateArea(radius)));
    }
    public static Double calculateArea(Double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    public static void main(String[] args) {
        getInformation();
    }
}
