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
    Stack(char[] a) {
        top = 0;
        s = new char[a.length];

        for (int i = 0; i < a.length; i++)
            push(a[i]);
    }

    // Put a character into the queue.
    void push(char ch) {
        if (top == s.length) {
            System.out.println(" - Stack is full.");
            return;
        }

        s[top++] = ch;
    }

    // Get a character from the queue.
    char pop() {
        if (top == 0) {
            System.out.println(" - Stack is empty.");
            return (char) 0;
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

        char[] name = {'T', 'o', 'm'};
        var s2 = new Stack(name);

        char ch;
        int i;

        // push some characters into s1
        for (i = 0; i < 10; i++)
            s1.push((char) ('A' + i));
        s1.pop();
        s1.pop();
        s1.push('Z');

        // construct queue from another queue
        var s3 = new Stack(s1);

        // Show the queues.
        System.out.println("Contents of s1:");
        s1.contents();

        System.out.println('\n');

        System.out.println("Contents of s2:");
        s2.contents();

        System.out.println('\n');

        System.out.println("Contents of s3:");
        s3.contents();
    }
}
