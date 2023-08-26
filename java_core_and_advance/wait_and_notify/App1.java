package wait_and_notify;

public class App1 {
    static int balance = 0;

    public void withdraw(int amount) {
        synchronized (this) {
            if (balance <= 0) {
                System.out.println("your balance is " + balance);
                try {
                    System.out.println("Waiting for balance to be deposited");
                    wait(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        balance = balance - amount;
        System.out.println("withdrawl successful and current balance is : " + balance);
    }

    public void deposit(int amount) {
        System.out.println("Depositing money");
        balance = balance + amount;
    }

    public static void main(String[] args) {
        App1 app = new App1();
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                app.withdraw(1000);
            }
        });
        thread1.setName("thread 1");
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                app.deposit(2000);
            }
        });
        thread1.setName("thread 2");
        thread2.start();
    }
}
