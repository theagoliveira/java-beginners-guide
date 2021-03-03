// An exceptin for queue-full errors.
public class QueueFullException extends Exception {
    final int size;

    QueueFullException(int s) {
        size = s;
    }

    @Override
    public String toString() {
        return "\nQueue is full. Maximum size is " + size;
    }
}
