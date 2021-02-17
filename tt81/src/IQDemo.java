// A fixed-size queue class for characters.
class FixedQueue implements ICharQ {
    private char[] q; // this array holds the queue
    private int putloc; // the put and
    private int getloc; // get indices

    // Construct an empty queue given its size.
    public FixedQueue(int size) {
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // Put a character into the queue.
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    // Get a character from the queue.
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }

    // Reset the queue.
    public void reset() {
        int size = q.length;
        q = new char[size];
        putloc = getloc = 0;
    }
}


// A circular queue.
class CircularQueue implements ICharQ {
    private char[] q; // this array holds the queue
    private int putloc; // the put and
    private int getloc; // get indices

    // Construct an empty queue given its size.
    public CircularQueue(int size) {
        q = new char[size + 1]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // Put a character into the queue.
    public void put(char ch) {
        /*
         * Queue is full if either putloc is one less than getloc, or if putloc is at the end of the
         * array and getloc is at the beginning.
         */
        if ((putloc == getloc - 1) || ((putloc == q.length - 1) && (getloc == 0))) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
        putloc %= q.length;
    }

    // Get a character from the queue.
    public char get() {
        /* Queue is empty if getloc is equal to putloc. */
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        char ch = q[getloc++];
        getloc %= q.length;
        return ch;
    }

    // Reset the queue.
    public void reset() {
        int size = q.length;
        q = new char[size];
        putloc = getloc = 0;
    }
}


// A dynamic queue.
class DynQueue implements ICharQ {
    private char[] q; // this array holds the queue
    private int putloc; // the put and
    private int getloc; // get indices

    // Construct an empty queue given its size.
    public DynQueue(int size) {
        q = new char[size + 1]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // Put a character into the queue.
    public void put(char ch) {
        if (putloc == q.length) {
            // increase queue size
            char[] t = new char[q.length * 2];

            // copy elements into new queue
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];

            q = t;
        }

        q[putloc++] = ch;
    }

    // Get a character from the queue.
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }

    // Reset the queue.
    public void reset() {
        int size = q.length;
        q = new char[size];
        putloc = getloc = 0;
    }
}


// A circular dynamic queue.
class CircularDynQueue implements ICharQ {
    private char[] q; // this array holds the queue
    private int putloc; // the put and
    private int getloc; // get indices

    // Construct an empty queue given its size.
    public CircularDynQueue(int size) {
        q = new char[size + 1]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // Put a character into the queue.
    public void put(char ch) {
        /*
         * Queue is full if either putloc is one less than getloc, or if putloc is at the end of the
         * array and getloc is at the beginning.
         */
        if ((putloc == getloc - 1) || ((putloc == q.length - 1) && (getloc == 0))) {
            // increase queue size
            char[] t = new char[q.length * 2];

            // copy elements into new queue
            int count = 0;
            for (char c = get(); c != (char) 0; c = get())
                t[count++] = c;

            q = t;
            getloc = 0;
            putloc = count;
        }

        q[putloc++] = ch;
        putloc %= q.length;
    }

    // Get a character from the queue.
    public char get() {
        /* Queue is empty if getloc is equal to putloc. */
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        char ch = q[getloc++];
        getloc %= q.length;
        return ch;
    }

    // Reset the queue.
    public void reset() {
        int size = q.length;
        q = new char[size];
        putloc = getloc = 0;
    }
}


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
