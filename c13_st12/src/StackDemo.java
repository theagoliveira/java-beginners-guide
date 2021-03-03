/*
 * 3. The complement of a queue is a stack. It uses first-in, last-out accessing and is often
 * likened to a stack of plates. The first plate push on the table is the last plate used. Create a
 * stack class called Stack that can hold characters. Call the methods that access the stack push()
 * and pop(). Allow the user to specify the size of the stack when it is created. Keep all other
 * members of the Stack class private. (Hint: You can use the Stack class as a model; just change
 * the way the data is accessed.)
 *
 */

// A queue class for characters.
class Stack {
    private char[] s; // this array holds the queue
    private int top; // the top index

    // Construct an empty Stack given its size.
    Stack(int size) {
        s = new char[size];
        top = 0;
    }

    // Construct a Stack from a Stack.
    Stack(Stack ob) {
        top = ob.top;
        s = new char[ob.s.length];

        // copy elements
        for (int i = 0; i < top; i++)
            s[i] = ob.s[i];
    }

    // Construct a Stack with initial values.
    Stack(char[] a) throws StackFullException {
        top = 0;
        s = new char[a.length];

        for (int i = 0; i < a.length; i++)
            push(a[i]);
    }

    // Put a character into the stack.
    void push(char ch) throws StackFullException {
        if (top == s.length) {
            throw new StackFullException(s.length);
        }

        s[top++] = ch;
    }

    // Get a character from the stack.
    char pop() throws StackEmptyException {
        if (top == 0) {
            throw new StackEmptyException();
        }

        return s[--top];
    }

    void contents() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }
}


// Demonstrate the Stack class.
class StackDemo {
    public static void main(String[] args) {
        // construct 10-element empty queue
        var s1 = new Stack(10);

        try {
            // push some characters into s1
            for (int i = 0; i < 11; i++) {
                System.out.printf("Pushing %c into Stack q1... ", (char) ('A' + i));
                s1.push((char) ('A' + i));
                System.out.println("OK!");
            }
        } catch (StackFullException e) {
            System.out.println(e);
        }

        try {
            // push some characters into s1
            for (int i = 0; i < 11; i++) {
                System.out.printf("Getting a character from Stack q1: ");
                char c = s1.pop();
                System.out.printf("%c ...", c);
                System.out.println("OK!");
            }
        } catch (StackEmptyException e) {
            System.out.println(e);
        }
    }
}
