package serialization_of_object;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private String type;
    private int number;

    public Vehicle(String type, int number) {
        this.type = type;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Vehicle [Type = " + type + ", number = " + number + "]";
    }
}
