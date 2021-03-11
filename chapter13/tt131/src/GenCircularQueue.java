// A generic, circular queue class.
class GenCircularQueue<T> implements IGenQ<T> {
    private T[] q; // this array holds the queue
    private int putloc; // the put and
    private int getloc; // get indices

    // Construct an empty queue with the given array.
    public GenCircularQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    // Put an item into the queue.
    public void put(T obj) throws QueueFullException {
        if ((putloc == getloc - 1) || ((putloc == q.length - 1) && (getloc == 0))) {
            throw new QueueFullException(q.length - 1);
        }

        q[putloc++] = obj;
        putloc %= q.length;
    }

    // Get a object from the queue.
    public T get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();

        T e = q[getloc++];
        getloc %= q.length;
        return e;
    }
}
