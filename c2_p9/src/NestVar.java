/**
 * NestVar
 */
public class NestVar {
    public static void main(String[] args) {
        int count;

        for (count = 0; count < 10; count++) {
            System.out.println("This is count: " + count);

            int count; // illegal!!!
            for (count = 0; count < 2; count++) {
                System.out.println("This program is in error!");
            }
        }
    }
}
