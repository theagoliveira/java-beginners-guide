import java.io.IOException;

// Read a character from the keyboard.
public class KbIn {
    public static void main(String[] args) throws IOException {
        char ch;

        System.out.print("Press a key followed by ENTER: ");

        ch = (char) System.in.read(); // get a char

        System.out.println("Your key is: " + ch);
    }
}
