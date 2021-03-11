/*
 * 2. Create a subclass of TwoDShape called Circle. Include an area() method that computes the area
 * of the circle and a constructor that uses super to initialize the TwoDShape portion.
 */

// Create an abstract class.
abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    // A default constructor
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    // Parameterized constructor.
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Construct an object with equal width and height
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    // Construct an object from an object.
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Accessor methods for width and height.
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    String getName() {
        return name;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

    abstract double area();
}


// A subclass of TwoDShape for circles.
class Circle extends TwoDShape {
    // A default constructor
    Circle() {
        super();
    }

    // One argument constructor.
    Circle(double r) {
        super(r, "circle"); // call superclass constructor
    }

    // Construct an object from an object.
    Circle(Circle ob) {
        super(ob); // pass object to TwoDShape constructor
    }

    void showDim() {
        System.out.println("Radius is " + getWidth() / 2);
    }

    // Override area() for Circle.
    double area() {
        double radius = getWidth() / 2;
        return 3.1416 * radius * radius;
    }
}


class CircleDemo {
    public static void main(String[] args) {
        var circle = new Circle(1.0);

        System.out.println("Object is " + circle.getName());
        System.out.println("Area is " + circle.area());
        circle.showDim();
        System.out.println();
    }
}
