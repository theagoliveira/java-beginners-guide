/*
 * 4. The traffic light simulation developed in Try This 12-1 can be improved with a few simple
 * changes that take advantage of an enumeration’s class features. In the version shown, the
 * duration of each color was controlled by the TrafficLightSimulator class by hard- coding these
 * values into the run() method. Change this so that the duration of each color is stored by the
 * constants in the TrafficLightColor enumeration. To do this, you will need to add a constructor, a
 * private instance variable, and a method called getDelay(). After making these changes, what
 * improvements do you see? On your own, can you think of other improvements? (Hint: Try using
 * ordinal values to switch light colors rather than relying on a switch statement.)
 */
enum TrafficLightColor {
    GREEN(1000), YELLOW(200), RED(1200);

    private int delay;

    TrafficLightColor(int d) {
        delay = d;
    }

    int getDelay() {
        return delay;
    }
}


// A computerized traffic light.
class TrafficLightSimulator implements Runnable {
    private TrafficLightColor tlc; // holds the traffic light color
    private boolean stop = false; // set to true to stop the simulation
    private boolean changed = false; // true when the light has changed

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
    }

    // Start up the light.
    public void run() {
        while (!stop) {
            try {
                Thread.sleep(tlc.getDelay());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            changeColor();
        }
    }

    // Change color.
    synchronized void changeColor() {
        tlc = TrafficLightColor.values()[(tlc.ordinal() + 1) % 3];
        changed = true;
        notify(); // signal that the light has changed
    }

    // Wait until a light change occurs.
    synchronized void waitForChange() {
        try {
            while (!changed) {
                wait(); // wait for light to change
            }
            changed = false;
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // Return current color.
    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    // Stop the traffic light.
    synchronized void cancel() {
        stop = true;
    }
}


public class TrafficLightDemo {
    public static void main(String[] args) {
        var tl = new TrafficLightSimulator(TrafficLightColor.GREEN);
        var thrd = new Thread(tl);
        thrd.start();

        for (int i = 0; i < 6; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }

        tl.cancel();
    }
}
