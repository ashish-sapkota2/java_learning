package examples;

import java.util.Scanner;

public class Factorization {
    static int number = 1;

    static int fact(int n) {
        if (n > 0) {
            number = n * fact(n - 1);
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number to calculate factorial: ");
        Scanner num = new Scanner(System.in);
        int user = num.nextInt();
        System.out.println("The factorial of " + user + " is : " + fact(user));
    }
}
