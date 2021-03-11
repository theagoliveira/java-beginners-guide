// A program that uses the Vehicle class.

class Vehicle {
    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon

    // Return the range.
    int range() {
        return mpg * fuelcap;
    }
}


// This class declares an object of type Vehicle.
public class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // compute the range assuming a full tank of gas
        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println(
                "Minivan can carry " + minivan.passengers + " with range of " + range1 + " miles.");

        System.out.println("Sportscar can carry " + sportscar.passengers + " with range of "
                + range2 + " miles.");
    }
}
