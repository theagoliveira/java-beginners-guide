import java.util.*;

// A generic, dynamic queue class.
class GenDynQueue<T> implements IGenQ<T> {
    private List<T> q; // this array holds the queue

    // Construct an empty queue with the given array.
    public GenDynQueue(List<T> aRef) {
        q = aRef;
    }

    // Put an item into the queue.
    public void put(T obj) {
        q.add(obj);
    }

    // Get a object from the queue.
    public T get() throws QueueEmptyException {
        if (q.isEmpty())
            throw new QueueEmptyException();

        return q.remove(0);
    }
}
