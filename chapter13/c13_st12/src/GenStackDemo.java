/*
 * 12. Convert your solution to question 10 of the Self Test for Chapter 9 so that it is generic. In
 * the process, create a stack interface called IGenStack that generically defines the operations
 * push() and pop().
 */
class GenStackDemo {
    public static void main(String[] args) {
        // construct 10-element empty queue
        Integer[] arr1 = new Integer[10];
        Double[] arr2 = new Double[10];
        Double[] arr3 = {1.1, 2.2, 3.3, 4.4, 5.5};
        Double[] arr4 = new Double[10];
        var s1 = new GenStack<Integer>(arr1);
        var s2 = new GenStack<Double>(arr2, arr3);
        var s3 = new GenStack<Double>(arr4, s2);

        try {
            // push some integers into s1
            for (int i = 0; i < 11; i++) {
                System.out.printf("Pushing %d into Stack s1... ", i + 88);
                s1.push(i + 88);
                System.out.println("OK!");
            }
        } catch (StackFullException e) {
            System.out.println(e);
        }

        try {
            // push some integers into s1
            for (int i = 0; i < 11; i++) {
                System.out.printf("Getting a integer from Stack s1: ");
                int c = s1.pop();
                System.out.printf("%d ...", c);
                System.out.println("OK!");
            }
        } catch (StackEmptyException e) {
            System.out.println(e);
        }

        try {
            // push some doubles into s2
            for (int i = 0; i < 11; i++) {
                System.out.printf("Pushing %.2f into Stack s2... ", (double) i + 8.8);
                s2.push((double) i + 8.8);
                System.out.println("OK!");
            }
        } catch (StackFullException e) {
            System.out.println(e);
        }

        try {
            // push some doubles into s2
            for (int i = 0; i < 11; i++) {
                System.out.printf("Getting a double from Stack s2: ");
                double c = s2.pop();
                System.out.printf("%.2f ...", c);
                System.out.println("OK!");
            }
        } catch (StackEmptyException e) {
            System.out.println(e);
        }

        try {
            // push some doubles into s3
            for (int i = 0; i < 11; i++) {
                System.out.printf("Pushing %.2f into Stack s3... ", (double) i + 8.8);
                s3.push((double) i + 8.8);
                System.out.println("OK!");
            }
        } catch (StackFullException e) {
            System.out.println(e);
        }

        try {
            // push some doubles into s3
            for (int i = 0; i < 11; i++) {
                System.out.printf("Getting a double from Stack s3: ");
                double c = s3.pop();
                System.out.printf("%.2f ...", c);
                System.out.println("OK!");
            }
        } catch (StackEmptyException e) {
            System.out.println(e);
        }
    }
}
