package com.company;

import java.text.DecimalFormat;

public class SupplementaryExercise1 {

    static Double numberA = 356.0;
    static Double numberB = 146.0;

    public static Double add() {
        return numberA + numberB;
    }

    public static Double subtract() {
        return numberA - numberB;
    }

    public static Double multiply() {
        return numberA * numberB;
    }

    public static Double divide() {
        return numberA / numberB;
    }

    public static Double module() {
        return numberA % numberB;
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("The result of adding " + numberA + " + " + numberB + " = " + df.format(add()));
        System.out.println("The result of subtracting " + numberA + " - " + numberB + " = " + df.format(subtract()));
        System.out.println("The result of multiplying " + numberA + " * " + numberB + " = " + df.format(multiply()));
        System.out.println("The result of dividing " + numberA + " / " + numberB + " = " + df.format(divide()));
        System.out.println("The result module " + numberA + " % " + numberB + " = " + df.format(module()));

    }
}
