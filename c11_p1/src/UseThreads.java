// Create a thread by implementing Runnable.

class MyThread implements Runnable {
    String thrdName;

    MyThread(String name) {
        thrdName = name;
    }

    // Entry point of thread.
    public void run() {
        System.out.println(thrdName + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrdName + ", count is " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }
}


public class UseThreads {
    public static void main(String[] args) {
        String thrdName = "Main thread";
        System.out.println(thrdName + " starting.");

        // First, construct a MyThread object.
        var mt = new MyThread("Child #1");

        // Next, construct a thread from that object.
        Thread newThrd = new Thread(mt);

        // Finally, start execution of the thread.
        newThrd.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(thrdName + " interrupted.");
            }
        }
        System.out.println(thrdName + " ending.");
    }
}
