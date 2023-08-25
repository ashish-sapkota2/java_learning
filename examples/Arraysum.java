package examples;

public class Arraysum {
    static int[] numbers = { 1, 2, 3, 10, 25 };
    static int sum = 0;

    public static void main(String[] args) {
        // for (int i = 0; i < numbers.length; i++) {
        // sum += numbers[i];
        // }
        for (int i : numbers) {
            sum += i;
        }
        System.err.println(sum);
    }

}
