package Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        HashSet<Integer> number = new HashSet<Integer>();
        for (int i = 10; i < 50; i++) {
            number.add(i);
        }
        for (int i : number) {

            System.out.println(i);
        }
        System.out.println(number);
        System.out.println("enter the number you want to search : ");
        int find = num.nextInt();
        if (number.contains(find)) {
            System.out.println(find + " is present in the system");
        } else {
            System.out.println(find + " is not in the system");
        }
    }
}