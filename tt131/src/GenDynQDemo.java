import java.util.*;

/*
 * Try This 13-1
 *
 * Demonstrate a generic dynamic queue class.
 */
class GenDynQDemo {
    public static void main(String[] args) {
        // Create an integer queue.
        List<Integer> iStore = new ArrayList<Integer>();
        var q = new GenDynQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a queue of Integers. (1)");
        for (int i = 0; i < 25; i++) {
            System.out.println("Adding " + i + " to q.");
            q.put(i); // add integer value to q
        }
        System.out.println();

        try {
            for (int i = 0; i < 26; i++) {
                System.out.print("Getting next Integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }
        System.out.println();
    }
}
