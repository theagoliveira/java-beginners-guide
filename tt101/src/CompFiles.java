/*
 * Try This 10-1
 *
 * Compare two files.
 *
 * To use this program, specify the names of the files to be compared on the command line.
 *
 * java CompFile FIRST.TXT SECOND.TXT
 */

import java.io.*;

public class CompFiles {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int ln = 1;
        int col = 1;

        // First make sure that both files have been specified.
        if (args.length != 2) {
            System.out.println("Usage: CompFiles f1 f2");
            return;
        }

        // Compare the files.
        try (var f1 = new FileInputStream(args[0]); var f2 = new FileInputStream(args[1])) {
            do {
                i = f1.read();
                j = f2.read();
                if ((i >= 65) && (i <= 90))
                    i += 32;
                if ((j >= 65) && (j <= 90))
                    j += 32;
                if (i != j)
                    break;
                col++;
                if (i == 10) {
                    ln++;
                    col = 1;
                }
            } while (i != -1 && j != -1);

            if (i != j)
                System.out.printf("Files differ in line %d, column %d.%n", ln, col);
            else
                System.out.println("Files are the same.");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
