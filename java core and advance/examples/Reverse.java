package examples;

public class Reverse {
    static String originalStr = "Hello Ashish";
    static String reversedStr = "";

    public static void main(String[] args) {
        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        System.out.println(reversedStr);
    }
}