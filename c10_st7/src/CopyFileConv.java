/*
 * 7. Write a program that copies a text file. In the process, have it convert all spaces into
 * hyphens. Use the byte stream file classes. Use the traditional approach to closing a file by
 * explicitly calling close().
 */
import java.io.*;

public class CopyFileConv {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // First, make sure that both files have been specified.
        if (args.length != 2) {
            System.out.println("Usage: CopyFileConv from to");
            return;
        }

        // Copy a File.
        try {
            // Attempt to open the files.
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) {
                    if (i == (int) ' ')
                        fout.write((int) '-');
                    else
                        fout.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException e) {
                System.out.println("Error Closing Input File");
            }

            try {
                if (fout != null)
                    fout.close();
            } catch (IOException e) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}
