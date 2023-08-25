package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abc");
        Matcher matcher = pattern.matcher("hello abhi");
        boolean match = matcher.find();
        if (match) {
            System.out.println("matched");
        } else {
            System.out.println("not matched");
        }
    }
}
