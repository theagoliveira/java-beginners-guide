// Write and then read back binary data.

import java.io.*;

class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;
        final String WRITING = "Writing ";
        final String READING = "Reading ";

        // Write some values.
        try (var dataOut = new DataOutputStream(new FileOutputStream("test.bin"))) {
            System.out.println(WRITING + i);
            dataOut.writeInt(i);

            System.out.println(WRITING + d);
            dataOut.writeDouble(d);

            System.out.println(WRITING + b);
            dataOut.writeBoolean(b);

            System.out.println(WRITING + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        } catch (IOException e) {
            System.out.println("Write error.");
            return;
        }

        System.out.println();

        // Now read them back.
        try (var dataOut = new DataInputStream(new FileInputStream("test.bin"))) {
            i = dataOut.readInt();
            System.out.println(READING + i);

            d = dataOut.readDouble();
            System.out.println(READING + d);

            b = dataOut.readBoolean();
            System.out.println(READING + b);

            d = dataOut.readDouble();
            System.out.println(READING + d);
        } catch (IOException e) {
            System.out.println("Read error.");
        }
    }
}
