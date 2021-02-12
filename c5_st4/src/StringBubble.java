/*
 * 4. Change the sort in Try This 5-1 so that it sorts an array of strings. Demonstrate that it
 * works.
 */
class StringBubble {
    public static void main(String[] args) {
        String[] strs = {"ds", "gx", "ad", "ae", "cr", "bg", "eh", "hf", "fo", "iy"};
        String t;
        int a, b;
        int size;

        size = 10; // number of elements to sort

        // display original array
        System.out.print("Original array is:\t");
        for (int i = 0; i < size; i++)
            System.out.print(" " + strs[i]);
        System.out.println();

        // This is the Bubble sort.
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (strs[b - 1].compareTo(strs[b]) > 0) { // if out of order
                    // exchange elements
                    t = strs[b - 1];
                    strs[b - 1] = strs[b];
                    strs[b] = t;
                }
            }
        }

        // display sorted array
        System.out.print("Sorted array is:\t");
        for (int i = 0; i < size; i++)
            System.out.print(" " + strs[i]);
        System.out.println();
    }
}
