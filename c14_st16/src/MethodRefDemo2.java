// Use a method reference to an instance method.

// A functional interface for numeric predicates that operate
// on integer values.
interface IntPredicate {
    boolean test(int n);
}


// This class stores an int value and defines the instance
// method isFactor(), which returns true if its argument
// is a factor of the store value.
class MyIntNum {
    private int v;

    MyIntNum(int x) {
        v = x;
    }

    int getNum() {
        return v;
    }

    // Return true if n is a factor v.
    boolean isFactor(int n) {
        return (v % n) == 0;
    }

    boolean hasCommonFactor(int n) {
        int min = n;
        if (v < min)
            min = v;

        for (int i = 2; i <= min; i++) {
            if ((v % i == 0) && (n % i == 0))
                return true;
        }

        return false;
    }
}


public class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        var myNum = new MyIntNum(12);
        var myNum2 = new MyIntNum(16);

        // Here, a method reference to hasCommonFactor on myNum is created.
        IntPredicate ip = myNum::hasCommonFactor;

        // Now, it is used to call hasCommonFactor() via test().
        result = ip.test(9);
        if (result)
            System.out.printf("%d and %d have a common factor%n", 9, myNum.getNum());

        // This time, a method reference to hasCommonFactor on myNum2 is created
        // and used to call hasCommonFactor() via test().
        ip = myNum2::hasCommonFactor;
        result = ip.test(9);
        if (!result)
            System.out.printf("%d and %d have no common factor%n", 9, myNum2.getNum());
    }
}
