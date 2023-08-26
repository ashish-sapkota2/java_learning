package marks_calculator;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        float percentage = 0;
        int marks;
        Scanner Marks = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your marks for subject" + (i + 1) + ": ");
            marks = Marks.nextInt();
            percentage += marks;
        }
        System.out.println(percentage);
        percentage = (percentage / 5);
        System.out.println("Your percentage is: " + percentage + "%");
    }
}
