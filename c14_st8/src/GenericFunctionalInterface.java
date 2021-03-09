/*
 * 8. Create a generic functional interface called MyFunc<T>. Call its abstract method func(). Have
 * func() return a reference of type T. Have it take a parameter of type T. (Thus, MyFunc will be a
 * generic version of NumericFunc shown in the chapter.) Demonstrate its use by rewriting your
 * answer to question 7 so it uses MyFunc<T> rather than NumericFunc.
 */

interface MyFunc<T> {
    T func(T n);
}


public class GenericFunctionalInterface {
    public static void main(String[] args) {
        MyFunc<Integer> factorial = n -> {
            int result = 1;
            for (int i = 2; i <= n; result *= i++);
            return result;
        };

        for (int i = 1; i <= 10; i++) {
            System.out.printf("The factorial of %d is %d%n", i, factorial.func(i));
        }
    }
}
