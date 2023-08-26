package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "london");
        capitalCities.put("England", "london");
        capitalCities.put("Nepal", "Kathmandu");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Norway", "Oslo");
        System.out.println(capitalCities);
        // System.out.println(capitalCities.get("Nepal"));
        // capitalCities.remove("England");
        // System.out.println(capitalCities);
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        // for (String i : capitalCities.keySet()) {
        // System.out.println(i);
        // }
        for (String i : capitalCities.keySet()) {
            System.out.println("Key : " + i + " Value : " + capitalCities.get(i));
        }
    }
}
