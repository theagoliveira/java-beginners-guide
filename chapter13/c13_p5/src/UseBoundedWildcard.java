class A {
    // ...
}


class B extends A {
    // ...
}


class C extends A {
    // ...
}


class D {
    // ...
}


class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }
}


class UseBoundedWildcard {
    // Here, the ? will match A or any class type
    // that extends A.
    static void test(Gen<? extends A> o) {
        // ...
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        var w1 = new Gen<A>(a);
        var w2 = new Gen<B>(b);
        var w3 = new Gen<C>(c);
        var w4 = new Gen<D>(d);

        // These calls o test() are OK.
        test(w1);
        test(w2);
        test(w3);

        // Can't call test() with w4 because
        // it is not an object of a class that
        // inherits A.
        // test(w4);
    }
}
