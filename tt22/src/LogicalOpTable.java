/*
 * Try This 2-2: a truth table for the logical operators.
 */
public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = false;
        q = false;
        System.out.println(
                p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));

        p = false;
        q = true;
        System.out.println(
                p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));

        p = true;
        q = false;
        System.out.println(
                p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));

        p = true;
        q = true;
        System.out.println(
                p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));

        /*
         * 6. On your own, try modifying the program so that it uses and displays 1’s and 0’s,
         * rather than true and false. This may involve a bit more effort than you might at first
         * think!
         */

        byte a, b;

        System.out.println("\nP\tQ\tAND\tOR\tXOR\tNOT");

        a = 0b0;
        b = 0b0;
        System.out.println(a + "\t" + b + "\t" + (a & b) + "\t" + (a | b) + "\t" + (a ^ b) + "\t"
                + ((a + 1) % 2));

        a = 0b0;
        b = 0b1;
        System.out.println(a + "\t" + b + "\t" + (a & b) + "\t" + (a | b) + "\t" + (a ^ b) + "\t"
                + ((a + 1) % 2));

        a = 0b1;
        b = 0b0;
        System.out.println(a + "\t" + b + "\t" + (a & b) + "\t" + (a | b) + "\t" + (a ^ b) + "\t"
                + ((a + 1) % 2));

        a = 0b1;
        b = 0b1;
        System.out.println(a + "\t" + b + "\t" + (a & b) + "\t" + (a | b) + "\t" + (a ^ b) + "\t"
                + ((a + 1) % 2));
    }
}
