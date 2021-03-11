// Demonstrate an array overrun.
public class ArrayErr {
    public static void main(String[] args) {
        int[] sample = new int[10];
        // generate an array overrun
        for (int i = 0; i < 100; i++) {
            sample[i] = i;
        }
    }
}
