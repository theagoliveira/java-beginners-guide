// Rethrow an exception.
class Rethrow {
    public static void genException() {
        // Here, numer is longer than denom.
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.printf("%d / %d is %d%n", numer[i], denom[i], numer[i] / denom[i]);
            } catch (ArithmeticException e) {
                // catch the exception
                System.out.println("Can't divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException e) {
                // catch the exception
                System.out.println("No matching element found.");
                throw e;
            }
        }
    }
}


class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        } catch (Exception e) {
            // recatch exception
            System.out.println("Fatal error - program terminated.");
        }
    }
}
