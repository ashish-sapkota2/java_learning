
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> num = new ArrayList<Integer>();
        cars.add("Tyota");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Audi");
        num.add(10);
        num.add(20);
        num.add(5);
        num.add(15);
        Collections.sort(num);
        System.out.println(num);
        for (String i : cars) { // for each loop
            System.out.println(i);
        }
        System.out.println("--------------");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

    }
}
