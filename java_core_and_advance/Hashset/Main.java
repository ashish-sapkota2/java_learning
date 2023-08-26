package Hashset;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Audi");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyata");
        cars.add("TATA");
        cars.add("Buggate");
        System.out.println(cars);
        System.out.println(cars.contains("BMW"));
    }
}
