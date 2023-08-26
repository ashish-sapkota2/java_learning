package synchronization;

class Brackets {
    public void generate() {
        synchronized (this) {
            for (int i = 0; i <= 10; i++) {
                if (i <= 5) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println();
        }
        for (int j = 0; j <= 10; j++) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class App {
    public static void main(String[] args) {
        Brackets bracket = new Brackets();
        bracket.generate();
        new Thread(new Runnable() {
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 1; i <= 5; i++) {

                    bracket.generate();
                }
                long endTime = System.currentTimeMillis();
                System.out.println(endTime - startTime);
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 1; i <= 5; i++) {
                    bracket.generate();
                }
                long endTime = System.currentTimeMillis();
                System.out.println(endTime - startTime);
            }
        }).start();
    }
}
