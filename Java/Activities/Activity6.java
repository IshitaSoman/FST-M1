package Activities;

import java.util.ArrayList;
import java.util.List;

class Plane {
    private int maxPassengers;
    private List<String> passengers;
    private long takeOffTime;
    private long lastTimeLanded;

    public Plane(int maxPassengers)
    {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }
    public void onboard(String passengerName) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passengerName);
            System.out.println(passengerName + " boarded the plane.");
        } else {
            System.out.println("Plane is full. " + passengerName + " cannot board.");
        }
    }
    public void takeOff()
    {
        takeOffTime = System.currentTimeMillis();
        System.out.println("Plane took off at " + takeOffTime);
    }
    public List<String> getPassengers() {
        return passengers;
    }
    public void land() {
        lastTimeLanded = System.currentTimeMillis();
        System.out.println("Plane landed at " + lastTimeLanded);
    }
    public long getLastTimeLanded() {
        return lastTimeLanded;
    }
}
public class Activity6 {
    public static void main(String[] args) {
        Plane plane = new Plane(10);

        plane.onboard("Passenger 1");
        plane.onboard("Passenger 2");
        plane.onboard("Passenger 3");
        plane.onboard("Passenger 4");
        plane.onboard("Passenger 5");
        plane.onboard("Passenger 6");
        plane.onboard("Passenger 7");
        plane.onboard("Passenger 8");
        plane.onboard("Passenger 9");
        plane.onboard("Passenger 10");
        plane.onboard("Passenger 11"); // Trying to board more than the maximum limit

        plane.takeOff();
        System.out.println("\nList of passengers:");
        List<String> passengers = plane.getPassengers();
        for (String passenger : passengers)
        {
            System.out.println(passenger);
        }

        try {
            Thread.sleep(5000); // Pause execution for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        plane.land();
        System.out.println("Time of landing: " + plane.getLastTimeLanded());
    }
}