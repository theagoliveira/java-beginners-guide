package qpack;

// A character queue interface.
public interface ICharQ {
    // Put a character into the queue.
    void put(char ch);

    // Get a character from the queue.
    char get();

    // Reset the queue.
    void reset();

    // Copy one queue into another.
    static void copy(ICharQ from, ICharQ to) {
        to.reset();
        for (char c = from.get(); c != (char) 0; c = from.get()) {
            to.put(c);
        }
    }
}
