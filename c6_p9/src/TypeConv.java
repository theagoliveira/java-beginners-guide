/* Automatic type conversions can affect overloaded method resolution. */
class Overload2 {
    void f(byte x) {
        System.out.println("Inside f(byte): " + x);
    }

    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}


public class TypeConv {
    public static void main(String[] args) {
        var ob = new Overload2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i); // calls ob.f(int)
        ob.f(d); // calls ob.f(double)

        ob.f(b); // calss ob.f(byte)

        ob.f(s); // calss ob.f(int) - type conversion
        ob.f(f); // calss ob.f(double) - type conversion
    }
}
