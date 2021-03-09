/*
 * 6. Create a functional interface that can support the lambda expression you created in question
 * 5. Call the interface MyTest and its abstract method testing().
 */

interface MyTest {
    boolean testing(int n);
}


public class MyTestDemo {
    public static void main(String[] args) {
        MyTest between10and20 = (n) -> (n >= 10) && (n <= 20);

        int x = 14;
        if (between10and20.testing(x))
            System.out.printf("%d is between 10 and 20%n", x);

        x = 24;
        if (!between10and20.testing(x))
            System.out.printf("%d is not between 10 and 20%n", x);
    }
}
