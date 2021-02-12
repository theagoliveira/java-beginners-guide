/*
 * Try This 5-2
 *
 * A queue class for characters.
 */
class Queue {
    char[] q; // this array holds the queue
    int putloc, getloc; // the put and get indices

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}


class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        // put some numbers into bigQ
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // retrieve and display elements from bigQ
        System.out.print("Contents of bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0)
                System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors
        for (i = 0; i < 5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();

        // more errors on smallQ
        System.out.print("Contents of smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0)
                System.out.print(ch);
        }
    }
}

/* 
 * 8. On your own, try modifying Queue so that it stores other types of objects. For example, have
 * it store ints or doubles.
 * 
 * class DoubleQueue {
 *     double[] q; // this array holds the queue
 *     int putloc, getloc; // the put and get indices
 *
 *     DoubleQueue(int size) {
 *         q = new double[size];
 *         putloc = getloc = 0;
 *     }
 *
 *     void put(double ch) {
 *         if (putloc == q.length) {
 *             System.out.println(" - Queue is full.");
 *             return;
 *         }
 *
 *         q[putloc++] = ch;
 *     }
 *
 *     double get() {
 *         if (getloc == putloc) {
 *             System.out.println(" - Queue is empty.");
 *             return 0;
 *         }
 *
 *         return q[getloc++];
 *     }
 * }
 *
 *
 * class QDemo {
 *     public static void main(String[] args) {
 *         DoubleQueue bigQ = new DoubleQueue(100);
 *         DoubleQueue smallQ = new DoubleQueue(4);
 *         double db;
 *         int i;
 *
 *         System.out.println("Using bigQ to store the alphabet.");
 *         // put some numbers into bigQ
 *         for (i = 0; i < 26; i++)
 *             bigQ.put((double) ('A' + i));
 *
 *         // retrieve and display elements from bigQ
 *         System.out.print("Contents of bigQ: ");
 *         for (i = 0; i < 26; i++) {
 *             db = bigQ.get();
 *             if (db != 0)
 *                 System.out.print(db + " ");
 *         }
 *
 *         System.out.println("\n");
 *
 *         System.out.println("Using smallQ to generate errors.");
 *         // Now, use smallQ to generate some errors
 *         for (i = 0; i < 5; i++) {
 *             System.out.print("Attempting to store " + (double) ('Z' - i));
 *             smallQ.put((double) ('Z' - i));
 *             System.out.println();
 *         }
 *         System.out.println();
 *
 *         // more errors on smallQ
 *         System.out.print("Contents of smallQ: ");
 *         for (i = 0; i < 5; i++) {
 *             db = smallQ.get();
 *             if (db != 0)
 *                 System.out.print(db + " ");
 *         }
 *     }
 * }
 */