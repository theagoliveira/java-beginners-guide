// A siple key-to-disk utility that demonstrates a FileWriter.

import java.io.*;

class KtoD {
    public static void main(String[] args) {
        String str;
        var br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter text ('stop' to quit).");

        try (var fw = new FileWriter("test.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();

                if (str.compareTo("stop") == 0)
                    break;

                str += "\r\n"; // add newline
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
