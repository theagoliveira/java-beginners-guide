/*
 * Try This 13-1
 *
 * Demonstrate a generic circular queue class.
 */
class GenCircQDemo {
    public static void main(String[] args) {
        // Create an integer queue.
        Integer[] iStore = new Integer[11];
        var q = new GenCircularQueue<Integer>(iStore);

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

        System.out.println("Demonstrate a queue of Integers. (2)");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + (2 * i) + " to q.");
                q.put(2 * i); // add integer value to q
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

        System.out.println("Demonstrate a queue of Integers. (3)");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + (3 * i) + " to q.");
                q.put(3 * i); // add integer value to q
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
    }
}
