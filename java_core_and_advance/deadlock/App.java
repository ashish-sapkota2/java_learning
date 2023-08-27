package deadlock;

public class App {
    public static void main(String[] args) {
        String lock1 = "lock1";
        String lock2 = "lock2";
        Thread thread1 = new Thread(new Runnable() {
            public void run() {

                synchronized (lock1) {
                    System.out.println("inside thread1 on lock 1");
                    synchronized (lock2) {
                        System.out.println("inside thread 1 on lock 2");
                    }
                }
                System.out.println("Inside thread 1");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                synchronized (lock2) {
                    System.out.println("inside thread 2 on lock 1");
                    synchronized (lock2) {
                        System.out.println("inside thread 2 on lock 2");
                    }
                }
                System.out.println("Inside thread 2");
            }
        });
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        thread1.start();
        thread2.start();
        System.out.println("INside main method");
    }
}
