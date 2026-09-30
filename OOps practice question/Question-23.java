class LowPriority extends Thread {

    public void run() {
        System.out.println(getName() + " = " + getPriority());
    }
}

class HighPriority extends Thread {

    public void run() {
        System.out.println(getName() + " = " + getPriority());
    }
}

public class Main {

    public static void main(String[] args) {

        LowPriority t1 = new LowPriority();
        HighPriority t2 = new HighPriority();

        t1.setName("LowPriority");
        t2.setName("HighPriority");

        t1.setPriority(3);
        t2.setPriority(8);

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Both threads completed.");
    }
}
