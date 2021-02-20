/*
 * Copy a text file.
 *
 * To use this program, specify the name of the source file and the destination file. For, to copy a
 * file called FIRST.TXT to a file called SECOND.TXT, use the following command line.
 *
 * java CopyFile FIRST.TXT SECOND.TXT
 */

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        int i;

        // First, make sure that both files have been specified.
        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        // Copy a File.
        try (var fin = new FileInputStream(args[0]); var fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if (i != -1)
                    fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
