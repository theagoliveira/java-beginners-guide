// Use a generic constructor.
class Summation {
    private int sum;

    <T extends Number> Summation(T arg) {
        sum = 0;

        for (int i = 0; i <= arg.intValue(); i++)
            sum += i;
    }

    int getSum() {
        return sum;
    }
}


class GenConsDemo {
    public static void main(String[] args) {
        var ob = new Summation(4.0);

        System.out.printf("Summation of %.1f is %d%n", 4.0, ob.getSum());
    }
}
