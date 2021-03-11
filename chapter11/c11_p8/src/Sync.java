// Use a synchronized block to control access to sumArray.

class SumArray {
    private int sum;

    int sumArray(int[] nums) {
        sum = 0; // reset sum

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println(
                    "Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(10); // allow task-switch
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }

        return sum;
    }
}


class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int[] a;
    int answer;

    // Construct a new thread.
    MyThread(String name, int[] nums) {
        thrd = new Thread(this, name);
        a = nums;
    }

    // A factory method that creates and starts a thread.
    public static MyThread createAndStart(String name, int[] nums) {
        var myThrd = new MyThread(name, nums);

        myThrd.thrd.start(); // start the thread
        return myThrd;
    }

    // Entry point of thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        synchronized (sa) {
            answer = sa.sumArray(a);
        }
        System.out.println("Sum for " + thrd.getName() + " is " + answer);
        System.out.println(thrd.getName() + " terminating.");
    }

}


class Sync {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        var mt1 = MyThread.createAndStart("Child #1", a);
        var mt2 = MyThread.createAndStart("Child #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
