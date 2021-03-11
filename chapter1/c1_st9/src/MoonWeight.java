/*
 * Chapter 1 Self Test 9
 *
 * The moon's gravity is about 17 percent that of earth's. Write a program that computes your
 * effective weight on the moon.
 *
 */
public class MoonWeight {
    public static void main(String[] args) {
        double weight, moonWeight;

        weight = 70;

        moonWeight = weight * 0.17;

        System.out.println("Weight on earth: " + weight + "kg");
        System.out.println("Effective weight on the moon: " + moonWeight + "kg");
    }
}
