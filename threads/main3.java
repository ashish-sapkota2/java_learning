package threads;

public class main3 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        main3 thread = new main3();
        thread.start();
        // wait for thread to finish
        while (thread.isAlive()) {
            System.out.println("Waiting--------");
        }
        // update amount and print its value
        System.out.println("main:" + amount);
        amount++;
        System.out.println("Main: " + amount);

    }

    public void run() {
        amount += 10;
        System.out.println("thread: " + amount);
    }
}
