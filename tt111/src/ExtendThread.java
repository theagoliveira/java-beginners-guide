/*
 * Try This 11-1
 *
 * Extend Thread.
 */

class MyThread extends Thread {
    // Construct a new thread.
    MyThread(String name) {
        super(name); // name thread
    }

    // Entry point of thread.
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }

    public static MyThread createAndStart(String name) {
        var myThrd = new MyThread(name);
        myThrd.start();
        return myThrd;
    }
}


public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        // var mt = new MyThread("Child #1");

        // mt.start();

        var mt = MyThread.createAndStart("Child #1");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
