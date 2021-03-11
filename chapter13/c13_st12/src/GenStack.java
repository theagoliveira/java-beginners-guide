class GenStack<T> implements IGenStack<T> {
    private T[] s; // this array holds the queue
    private int top; // the top index

    // Construct a Stack with initial values.
    GenStack(T[] aRef) {
        s = aRef;
        top = 0;
    }

    // Construct a Stack from a Stack.
    GenStack(T[] aRef, GenStack<T> stckOb) {
        top = stckOb.top;
        s = aRef;

        try {
            if (s.length < stckOb.s.length)
                throw new StackFullException(s.length);
        } catch (StackFullException e) {
            System.out.println(e);
        }

        // copy elements
        for (int i = 0; i < top; i++)
            s[i] = stckOb.s[i];
    }

    // Construct a Stack with initial values.
    GenStack(T[] aRef, T[] init) {
        top = 0;
        s = aRef;

        for (int i = 0; i < init.length; i++)
            try {
                push(init[i]);
            } catch (StackFullException e) {
                System.out.println(e);
            }
    }

    // Push a character into the stack.
    public void push(T obj) throws StackFullException {
        if (top == s.length)
            throw new StackFullException(s.length);

        s[top++] = obj;
    }

    // Pop a character from the stack.
    public T pop() throws StackEmptyException {
        if (top == 0)
            throw new StackEmptyException();

        return s[--top];
    }

    void contents() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }
}
