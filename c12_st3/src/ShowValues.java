/*
 * 3. Given the following enumeration, write a program that uses values( ) to show a list of the
 * constants and their ordinal values.
 */
enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}


public class ShowValues {
    public static void main(String[] args) {
        for (Tools t : Tools.values()) {
            System.out.println(t.ordinal() + " - " + t);
        }
    }
}
