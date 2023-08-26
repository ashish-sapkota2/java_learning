package examples;

class display {
    public void generate() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}

public class Star {
    public static void main(String[] args) {
        display disp = new display();
        disp.generate();
    }

}
