import qpack.*;

// Demonstrate the ICharQ interface
class IQDemo {
    public static void main(String[] args) {
        var q1 = new FixedQueue(10);
        var q2 = new DynQueue(5);
        var q3 = new CircularQueue(10);
        var q4 = new CircularDynQueue(5);
        var q5 = new FixedQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;
        // Put some characters into fixed queue.
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        // Show the queue.
        System.out.print("Contents of fixed queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        // Put some characters into dynamic queue.
        for (i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));

        // Show the queue.
        System.out.print("Contents of dynamic queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
        // Put some characters into circular queue.
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        // Show the queue.
        System.out.print("Contents of circular queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        // Put more characters into circular queue.
        for (i = 10; i < 20; i++)
            iQ.put((char) ('A' + i));

        // Show the queue.
        System.out.print("Contents of circular queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.print("\nStore and consume from circular queue: ");

        // Store in and consume from circular queue.
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }

        // Put some characters into circular dynamic queue.
        System.out.println("\n\n================================================");
        System.out.println("Put some characters into circular dynamic queue.");
        iQ = q4;
        for (i = 0; i < 20; i++)
            iQ.put((char) ('A' + i));

        // Show the queue.
        System.out.print("Contents of circular dynamic queue: ");
        for (i = 0; i < 25; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        // Put more characters into circular dynamic queue.
        System.out.println("\nPut more characters into circular dynamic queue.");
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
            if (i == 4) {
                System.out.println("Reset queue.");
                iQ.reset();
            }
        }

        // Show the queue.
        System.out.print("Contents of circular dynamic queue: ");
        for (i = 0; i < 15; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\n\n================================================");
        iQ = q5;
        // Put some characters into fixed queue.
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        // Put some characters into dynamic queue.
        iQ = q2;
        for (i = 0; i < 5; i++)
            iQ.put((char) ('Z' - i));

        ICharQ.copy(q5, q2);
        // Show the queue.
        System.out.print("Contents of dynamic queue after copy: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
    }
}
