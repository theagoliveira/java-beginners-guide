// In this version of NumericFns, the type argument
// for T must be either Number, or a class derived
// from Number.
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

    // Return the fraction component.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }
}


// Demonstrate NumericFns.
class BoundsDemo {
    public static void main(String[] args) {
        var iOb = new NumericFns<Integer>(5);
        System.out.printf("Reciprocal of iOb is %.2f%n", iOb.reciprocal());
        System.out.printf("Fractional component of iOb is %.2f%n%n", iOb.fraction());

        var dOb = new NumericFns<Double>(5.25);
        System.out.printf("Reciprocal of dOb is %.2f%n", dOb.reciprocal());
        System.out.printf("Fractional component of dOb is %.2f%n%n", dOb.fraction());

        // This won't compile because String is not a subclass of Number.
        // var strOb = new NumericFns<String>("Error");
    }
}
