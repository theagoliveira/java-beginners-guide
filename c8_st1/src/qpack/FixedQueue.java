package qpack;

// A fixed-size queue class for characters.
public class FixedQueue implements ICharQ {
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
