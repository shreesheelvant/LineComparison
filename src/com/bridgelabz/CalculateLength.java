package com.bridgelabz;


import java.util.Scanner;

public class CalculateLength {
    public static void calculateLengthUC2() {
        System.out.println("Calculate Length between two points");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 : ");
        int x1 = scanner.nextInt();
        System.out.println("Enter y1 : ");
        int y1 = scanner.nextInt();
        System.out.println("Enter x2 : ");
        int x2 = scanner.nextInt();
        System.out.println("Enter y2 : ");
        int y2 = scanner.nextInt();
        int length = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("length of first line:");

        System.out.println("Calculate Length between two points");
        System.out.println("Enter x3 : ");
        int x3 = scanner.nextInt();
        System.out.println("Enter z3 : ");
        int z3 = scanner.nextInt();
        System.out.println("Enter x4 : ");
        int x4 = scanner.nextInt();
        System.out.println("Enter y4 : ");
        int y4 = scanner.nextInt();
        int length1 = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("length of first line:");

        if (length == length) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }
    }

    public static void main(String[] args) {
        calculateLengthUC2();
    }

}




