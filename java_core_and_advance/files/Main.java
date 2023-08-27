package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.awt.Desktop;
import java.util.Scanner;
import java.io.Writer;

public class Main {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        try {
            File myObj = new File("java_core_and_advance/files/new.txt");
            if (myObj.createNewFile()) {
                System.out.println("File Created : " + myObj.getName());

            } else {
                try {
                    System.out.println("Enter the text you want to write on file: ");
                    String text1 = text.nextLine();
                    // open a file
                    // Desktop desktop = Desktop.getDesktop();
                    // desktop.open(myObj);
                    // write into file
                    FileWriter myWrite = new FileWriter(myObj, true);

                    myWrite.append(text1);
                    myWrite.append(text1);
                    // close file
                    myWrite.close();
                } catch (Exception e) {
                    System.out.println(e);
                    System.out.println("FIle already exist");
                }
                // read the file
                try {
                    Scanner read = new Scanner(myObj);
                    while (read.hasNextLine()) {
                        String data = read.nextLine();
                        System.out.println(data);
                    }
                    read.close();
                    System.out.println("File name :" + myObj.getName());
                    System.out.println("path :" + myObj.getAbsolutePath());
                    System.out.println("Writable :" + myObj.canWrite());
                    System.out.println("Readable :" + myObj.canRead());
                    System.out.println("File size in bytes :" + myObj.length());
                } catch (FileNotFoundException e) {
                    System.out.println("error");
                }
            }
        } catch (IOException e) {
            System.out.println("error occured");
            e.printStackTrace();
        }
    }
}