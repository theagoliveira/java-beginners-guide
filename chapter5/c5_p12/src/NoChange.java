// The for-each loop is essentially read-only.
class NoChange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : nums) {
            System.out.print(i + " ");
            i *= 10; // no effect on nums
        }

        System.out.println();

        for (int i : nums)
            System.out.print(i + " ");

        System.out.println();
    }
}
