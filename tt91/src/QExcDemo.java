// Demonstrater the queue exceptions
class QExcDemo {
    public static void main(String[] args) {
        var q = new FixedQueue(10);
        char ch;
        int i;

        try {
            // overrun the queue
            for (i = 0; i < 11; i++) {
                System.out.print("Attempting to store: " + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        } catch (QueueFullException e) {
            System.out.println(e);
        }
        System.out.println();


        try {
            // over-empty the queue
            for (i = 0; i < 11; i++) {
                System.out.print("Getting next char: ");
                ch = q.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }
    }
}
