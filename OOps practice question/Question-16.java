class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("Thread is starting.");

        MyThread t = new MyThread();

        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Thread has completed.");
    }
}
