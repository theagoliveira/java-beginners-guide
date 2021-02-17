public class StackFullException extends Exception {
    int size;

    StackFullException(int i) {
        size = i;
    }

    public String toString() {
        return "Stack is full. Maximum size is " + size;
    }
}
