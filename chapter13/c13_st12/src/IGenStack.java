// A generic stack interface.
public interface IGenStack<T> {
    // Push an item into the stack.
    void push(T obj) throws StackFullException;

    // Pop an item from the stack.
    T pop() throws StackEmptyException;
}
