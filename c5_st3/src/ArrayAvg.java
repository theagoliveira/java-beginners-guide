/*
 * 3. Write a program that uses an array to find the average of 10 double values. Use any 10 values
 * you like.
 */
class ArrayAvg {
    public static void main(String[] args) {
        double[] arr = {1.0, 9.0, 1.5, 8.5, 2.0, 8.0, 2.5, 7.5, 3.0, 7.0};
        var avg = 0d;

        for (double d : arr)
            avg += d / arr.length;

        System.out.println("Average: " + avg);
    }
}
