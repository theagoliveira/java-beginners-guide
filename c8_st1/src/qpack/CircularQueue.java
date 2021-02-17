package qpack;

// A circular queue.
public class CircularQueue implements ICharQ {
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
