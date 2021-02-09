/*
 * Chapter 1 Self Test 10
 *
 * Adapt Try This 1-2 so that it prints a conversion table of inches to meters. Display 12 feet of
 * conversions, inch by inch. Output a blank line every 12 inches. (One meter equals approximately
 * 39.37 inches.)
 *
 */
public class InchesToMeters {
    public static void main(String[] args) {
        double inches, meters;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37; // convert to meters
            System.out.println(inches + " inches is " + meters + " meters.");

            counter++;
            // every 12th inch, print a blank line
            if (counter == 12) {
                System.out.println();
                counter = 0; // reset the line counter
            }
        }
    }
}
