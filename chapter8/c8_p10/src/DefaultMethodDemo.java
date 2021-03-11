// Implement MyIF.
class MyIFImp implements MyIF {
    // Only getUserID() defined by MyIF needs to be implemented.
    // getAdminID() can be allowed to default.
    public int getUserID() {
        return 100;
    }
}


class MyIFImp2 implements MyIF {
    // Here, implementations for both getUserID() and getAdminID() are
    // provided.
    public int getUserID() {
        return 101;
    }

    @Override
    public int getAdminID() {
        return 42;
    }
}


// Use the default method.
class DefaultMethodDemo {
    public static void main(String[] args) {
        var obj = new MyIFImp();
        var obj2 = new MyIFImp2();

        // Can call getUserID(), because it is explicitly
        // implemented by MyIFImp:
        System.out.println("User ID is " + obj.getUserID());

        // Can also call getAdminID(), because of default
        // implementation:
        System.out.println("Administrator ID is " + obj.getAdminID());

        System.out.println("User 2 ID is " + obj2.getUserID());
        System.out.println("Administrator 2 ID is " + obj2.getAdminID());
    }
}
