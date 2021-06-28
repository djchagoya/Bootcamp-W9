package com.company;

import java.util.Scanner;

public class SupplementaryExercise2 {

    static String name;

    public static void greet() {
        System.out.println("What's your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Welcome "+name +"!");
    }
    public static void main(String[] args) {
        greet();
    }

}
