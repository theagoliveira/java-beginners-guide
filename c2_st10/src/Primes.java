/*
 * 10. Write a program that finds all of the prime numbers between 2 and 100.
 */
/**
 * Primes
 */
public class Primes {
    public static void main(String[] args) {
        int i;
        int j;
        int count;

        for (j = 2; j <= 100; j++) {
            count = 0;

            for (i = 1; i < j; i++) {
                if (j % i == 0)
                    count++;
            }

            if (count == 1)
                System.out.println(j);
        }
    }
}
