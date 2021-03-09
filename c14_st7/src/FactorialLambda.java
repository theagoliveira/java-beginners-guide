/*
 * 7. Create a block lambda that computes the factorial of an integer value. Demonstrate its use.
 * Use NumericFunc, shown in this chapter, for the functional interface.
 */

interface NumericFunc {
    int func(int n);
}


public class FactorialLambda {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 2; i <= n; result *= i++);
            return result;
        };

        for (int i = 1; i <= 10; i++) {
            System.out.printf("The factorial of %d is %d%n", i, factorial.func(i));
        }
    }
}
