import java.util.*;

/*
 * Try This 13-1
 *
 * Demonstrate a generic queue class.
 */
class GenQDemo {
    public static void main(String[] args) {
        // Create an integer queue.
        Integer[] iStore = new Integer[10];
        var q = new GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a queue of Integers. (1)");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + i + " to q.");
                q.put(i); // add integer value to q
            }
        } catch (QueueFullException e) {
            System.out.println(e);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Getting next Integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }
        System.out.println();

        // Create an double queue.
        Double[] dStore = new Double[10];
        var q2 = new GenQueue<Double>(dStore);

        Double dVal;

        System.out.println("Demonstrate a queue of Doubles.");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + ((double) i / 2) + " to q2.");
                q2.put((double) i / 2); // add integer value to q2
            }
        } catch (QueueFullException e) {
            System.out.println(e);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Getting next Double from q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }
        System.out.println();
    }
}
