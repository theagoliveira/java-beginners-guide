// Use a wildcard.
class NumericFns<T extends Number> {
    T num;

    // Pass the constructor a reference to
    // a numeric object.
    NumericFns(T n) {
        num = n;
    }

    // Return the reciprocal.
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Return the the fractional component.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // Determine if the absolute values of two
    // objects are the same.
    boolean absEqual(NumericFns<?> ob) {
        return Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue());
    }
}


// Demonstrate a wildcard.
class WildcardDemo {
    public static void main(String[] args) {
        var iOb = new NumericFns<Integer>(6);
        var dOb = new NumericFns<Double>(-6.0);
        var lOb = new NumericFns<Long>(5L);

        System.out.println("Testing iOb and dOb.");
        if (iOb.absEqual(dOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");

        System.out.println();

        System.out.println("Testing iOb and lOb.");
        if (iOb.absEqual(lOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");
    }
}
