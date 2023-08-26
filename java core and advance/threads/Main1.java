package threads;

public class Main1 implements Runnable {
    public static void main(String[] args) {
        Main1 obj = new Main1();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("outside thread---");
    }

    public void run() {
        System.out.println("inside thread");
    }
}
