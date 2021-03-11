/*
 * 7. Write a program that copies a text file. In the process, have it convert all spaces into
 * hyphens. Use the byte stream file classes. Use the traditional approach to closing a file by
 * explicitly calling close().
 */
import java.io.*;

public class CopyFileConv2 {
    public static void main(String[] args) {
        int i;

        // First, make sure that both files have been specified.
        if (args.length != 2) {
            System.out.println("Usage: CopyFileConv from to");
            return;
        }

        // Copy a File.
        try (var fin = new FileInputStream(args[0]); var fout = new FileOutputStream(args[1]);) {
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
        }
    }
}
