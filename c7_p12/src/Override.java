// Method overriding.
class A {
    int i;
    int j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}


class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // override show()
    /*
     * void show() { super.show(); System.out.println("k: " + k); }
     */

    // overload show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}


class Override {
    public static void main(String[] args) {
        var subOb = new B(1, 2, 3);

        subOb.show("This is k: ");
        subOb.show();
    }
}
