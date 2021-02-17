// An exception for queue-full errors.
public class QueueEmptyException extends Exception {
    public String toString() {
        return "\nQueue is empty";
    }
}
