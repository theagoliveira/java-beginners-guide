import java.io.IOException;

// Demonstrate the do-while loop.
public class DWDemo {
    public static void main(String[] args) throws IOException {
        char ch;

        do {
            System.out.print("Press a key followed by ENTER: ");
            ch = (char) System.in.read(); // get a char
        } while (ch != 'q');
    }
}
