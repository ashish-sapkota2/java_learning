package Exceptions;

import java.util.Scanner;

public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied");
        } else {
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args) {
        // int[] number = { 1, 2, 3 };
        // try {
        // System.out.println(number[5]);
        // } catch (Exception e) {
        // System.out.println("something went Wrong");
        // } finally {
        // System.out.println("this will run anyhow");
        // }
        Scanner age = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age1 = age.nextInt();
        checkAge(age1);

    }
}
