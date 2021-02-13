/*
 * 4. Given the Test class, write a method called swap() that exchanges the contents of the objects
 * referred to by two Test object references.
 *
 */
class Test {
    int a;

    Test(int i) {
        a = i;
    }

    static void swap(Test ob1, Test ob2) {
        int x = ob1.a;
        ob1.a = ob2.a;
        ob2.a = x;
    }
}


class TestSwap {
    public static void main(String[] args) {
        var x = new Test(1);
        var y = new Test(2);

        System.out.println("Before swap");
        System.out.println("x.a: " + x.a);
        System.out.println("y.a: " + y.a);

        Test.swap(x, y);

        System.out.println("After swap");
        System.out.println("x.a: " + x.a);
        System.out.println("y.a: " + y.a);
    }
}
