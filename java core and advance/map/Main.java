package map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();
        student.put(1, "Ashish");
        student.put(3, "Aakash");
        student.put(2, "mia");
        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println("KEy :" + entry.getKey() + "Value: " + entry.getValue());
        }
    }
}
