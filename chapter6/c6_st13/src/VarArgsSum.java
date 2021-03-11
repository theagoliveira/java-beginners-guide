/*
 * 13. Create a varargs method called sum( ) that sums the int values passed to it. Have it return
 * the result. Demonstrate its use.
 */
class ArrayUtils {
    private ArrayUtils() {
        throw new IllegalStateException("Utility class");
    }

    static int sum(int... arr) {
        int result = 0;

        for (int i : arr) {
            result += i;
        }

        return result;
    }
}


class VarArgsSum {
    public static void main(String[] args) {
        System.out.println("ArrayUtils.sum() = " + ArrayUtils.sum());
        System.out.println("ArrayUtils.sum(1) = " + ArrayUtils.sum(1));
        System.out.println("ArrayUtils.sum(1, 2) = " + ArrayUtils.sum(1, 2));
        System.out.println("ArrayUtils.sum(1, 2, 3) = " + ArrayUtils.sum(1, 2, 3));
        System.out.println("ArrayUtils.sum(1, 2, 3, 4) = " + ArrayUtils.sum(1, 2, 3, 4));
    }
}
