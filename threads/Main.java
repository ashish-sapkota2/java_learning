//thread causes concurrency problem. we cannot determine in which order the code is executing
//to avoid concurrency isAlive() method is used. it  checks whether the thread has finished running
//before using any attribute that the thread can change.
//example in main3.java

package threads;

public class Main extends Thread {
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("outside thread");
    }

    public void run() {
        System.out.println("inside thread");
    }
}
