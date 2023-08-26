package examples;

import java.util.Scanner;

public class PrimeNumber {
    static boolean CheckPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number to check if it is prime or not: ");
        int input = num.nextInt();
        if (CheckPrime(input)) {
            System.out.println("Given number is prime number");
        } else {
            System.out.println("Given number is not a prime Number");
        }
    }

}
