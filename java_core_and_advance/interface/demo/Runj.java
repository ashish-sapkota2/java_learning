package demo;

import Phone.iphone;
import Phone.samsung;
import Phone.phone;

public class Runj {
    public static void main(String[] args) {
        phone phone1 = new samsung();
        phone phone2 = new iphone();
        System.out.println(phone1.processor());
        System.out.println(phone2);
    }
}
