class FirstThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("First Thread");
        }
    }
}

class SecondThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Second Thread");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        t2.start();
    }
}
