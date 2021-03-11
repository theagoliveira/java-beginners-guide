import java.io.IOException;

/*
 * 10. The ASCII lowercase letters are separated from the uppercase letters by 32. Thus, to convert
 * a lowercase letter to uppercase, subtract 32 from it. Use this information to write a program
 * that reads characters from the keyboard. Have it convert all lowercase letters to uppercase, and
 * all uppercase letters to lowercase, displaying the result. Make no changes to any other
 * character. Have the program stop when the user enters a period. At the end, have the program
 * display the number of case changes that have taken place.
 */
public class ChangeCase {
    public static void main(String[] args) throws IOException {
        char ch;
        char ignore;
        int count = 0;

        do {
            System.out.print("Enter a character (enter a dot to end the program): ");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if ((ch >= 65) && (ch <= 90)) {
                ch += 32;
                System.out.println("Result: " + ch);
                count++;
            } else if ((ch >= 97) && (ch <= 122)) {
                ch -= 32;
                System.out.println("Result: " + ch);
                count++;
            }
        } while (ch != '.');

        System.out.println("Changes: " + count);
    }
}
