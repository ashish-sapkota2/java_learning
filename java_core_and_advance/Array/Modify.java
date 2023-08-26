import java.util.ArrayList;

public class Modify {
    static ArrayList<String> names = new ArrayList<String>();

    public static void main(String[] args) {
        names.add("Ashish");
        names.add("Anisha");
        names.add("Ankita");
        names.add("Anusha");
        names.add("Aakash");
        Modify disp = new Modify();
        disp.displayList();
        System.out.println("------------------");
        disp.displayByPosition(2);
        disp.modifyList(2, "Harish");
        System.out.println("----------------");
        disp.displayList();
        System.out.println(disp.search("Anusha"));
    }

    void displayList() {
        for (String i : names) {
            System.out.println(i);
        }
    }

    void displayByPosition(int a) {
        System.out.println(names.get(a));
    }

    void modifyList(int position, String name) {
        names.set(position, name);
    }

    int search(String name) {
        return names.indexOf(name);
    }
}
