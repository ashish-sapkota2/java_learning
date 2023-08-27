package serialization_of_object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle("bike", 8113);
        Vehicle car = new Vehicle("car", 6589);
        System.out.println(bike);
        try (FileOutputStream fos = new FileOutputStream("java_core_and_advance\\serialization_of_object\\vehicles.dat",
                false)) {
            try (ObjectOutputStream obj = new ObjectOutputStream(fos)) {
                obj.writeObject(bike);
                obj.writeObject(car);
                System.out.println("object written on the file");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOexception");
        }
    }
}