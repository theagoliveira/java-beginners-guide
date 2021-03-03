// A simple generic class with two type
// parameters: T and V.
class TwoGen<T, V> {
    T ob1;
    V ob2;

    // Pass the constructor references to
    // objects of type T and V.
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    // Show types of T and V.
    void showTypes() {
        System.out.printf("Type of T is %s%n", ob1.getClass().getName());
        System.out.printf("Type of V is %s%n", ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}


// Demonstrate TwoGen.
class SimpGen {
    public static void main(String[] args) {
        // Create a Gen reference for Integers.
        var tgObj = new TwoGen<Integer, String>(88, "Generics");

        // Show the types.
        tgObj.showTypes();

        // Get the value in iOb. Notice that
        // no cast is needed.
        int v = tgObj.getob1();
        System.out.printf("value: %d%n", v);
        String str = tgObj.getob2();
        System.out.printf("value: %s%n", str);
    }
}
