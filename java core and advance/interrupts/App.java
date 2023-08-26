package interrupts;

public class App {
    static public int balance = 0;

    public void withdraw(int amount) {
        synchronized (this) {
            if (balance <= 0) {
                try {
                    System.out.println("Waiting for balance updation");
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("thread got interrupted");
                    // e.printStackTrace();
                    balance = balance - amount;
                    System.out.println("Withdrawal successful" + balance);
                }
            }
        }
    }

    public void deposit(int amount) {
        System.out.println("We are depositing amount");
        balance = balance + amount;
        // synchronized (this) {
        // notifyAll();
        // notify();
        // }
    }

    public static void main(String[] args) {
        App app = new App();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                app.withdraw(1000);
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                try {

                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                app.deposit(2000);
                thread1.interrupt();
            }
        });
        thread2.setName("Thread 2");
        thread2.start();
        // if (balance <= 0) {
        // try {
        // Thread.sleep(5000);
        // } catch (InterruptedException e) {
        // // TODO: handle exception
        // e.printStackTrace();
        // }
        // thread1.interrupt();
        // }
    }
}