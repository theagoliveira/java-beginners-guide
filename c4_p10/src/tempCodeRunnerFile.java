// A program that uses the Vehicle class.

class Vehicle {
    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon

    // This is a constructor for Vehicle.
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range.
    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}


// This class declares an object of type Vehicle.
public class VehConsDemo {
    public static void main(String[] args) {
        // construct complete vehicles
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out
                .println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(dist);

        System.out.println(
                "To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
    }
}
