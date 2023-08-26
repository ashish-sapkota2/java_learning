package examples;

public class Wordcount {
    public static void main(String[] args) {
        String words ="One two three four";
        int countWords =words.split("\\s").length;
        System.out.println(countWords);
    }
}
