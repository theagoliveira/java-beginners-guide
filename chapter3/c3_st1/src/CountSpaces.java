import java.io.IOException;

/*
 * 1. Write a program that reads characters from the keyboard until a period is received. Have the
 * program count the number of spaces. Report the total at the end of the program.
 */
public class CountSpaces {
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

            if (ch == ' ')
                count++;
        } while (ch != '.');

        System.out.println("Spaces: " + count);
    }
}
