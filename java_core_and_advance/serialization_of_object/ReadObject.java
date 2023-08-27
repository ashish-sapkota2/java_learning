package serialization_of_object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (FileInputStream fio = new FileInputStream(
                "java_core_and_advance\\serialization_of_object\\vehicles.dat")) {
            try (ObjectInputStream obj = new ObjectInputStream(fio)) {
                try {
                    Vehicle v1 = (Vehicle) obj.readObject();
                    Vehicle v2 = (Vehicle) obj.readObject();
                    System.out.println("Object 1: " + v1);
                    System.out.println("Object 2: " + v2);
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
