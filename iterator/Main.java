package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");

        Iterator<String> it = cars.iterator();
        // print the first item
        System.out.println(it.next());

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
