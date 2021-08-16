// Demonstrate a simple generic method.
class GenericMethodDemo {
    // Determine if the contents of two arrays are the same.
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
        // If array lengths differ, then the arrays differ.
        if (x.length != y.length)
            return false;

        for (int i = 0; i < x.length; i++)
            if (!x[i].equals(y[i]))
                return false; // arrays differ

        return true; // contents of arrays are equivalent
    }

    public static void main(String[] args) {
        Integer[] nums1 = {1, 2, 3, 4, 5};
        Integer[] nums2 = {1, 2, 3, 4, 5};
        Integer[] nums3 = {1, 2, 7, 4, 5};
        Integer[] nums4 = {1, 2, 7, 4, 5, 6};

        if (arraysEqual(nums1, nums1))
            System.out.println("nums1 equals nums1");

        if (arraysEqual(nums1, nums2))
            System.out.println("nums1 equals nums2");

        if (arraysEqual(nums1, nums3))
            System.out.println("nums1 equals nums3");

        if (arraysEqual(nums1, nums4))
            System.out.println("nums1 equals nums4");

        // Create an array of Doubles
        Double[] dvals = {1.1, 2.2, 3.3, 4.4, 5.5};

        // This won't compile because nums and dvals
        // are not of the same type.
        // if (arraysEqual(nums1, dvals))
        //     System.out.println("nums1 equals dvals");
    }
}