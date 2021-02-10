// Declare loop control variable inside the for.
public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        for (int i = 1; i <= 5; i++) {
            sum += i; // i is known thoughout the loop
            fact *= i;
        }

        // but, i is not know here

        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
    }
}
