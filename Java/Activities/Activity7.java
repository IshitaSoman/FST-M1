package Activities;

interface BicycleOperations {
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface BicycleParts {
    int gears = 0;
    int speed = 0;
}
class Bicycle implements BicycleParts, BicycleOperations {
    int gears;
    int currentSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        currentSpeed += increment;
    }

    public void bicycleDesc() {
        System.out.println("Number of gears: " + gears);
        System.out.println("Current speed: " + currentSpeed);
    }
}
class MountainBike extends Bicycle {
    int seatHeight;

    public MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newHeight) {
        seatHeight = newHeight;
    }
}











public class Activity7 {


        public static void main(String[] args) {
            Bicycle bicycle = new Bicycle(5, 20);
            bicycle.bicycleDesc();
            bicycle.speedUp(10);
            bicycle.applyBrake(5);
            bicycle.bicycleDesc();

            System.out.println();

            MountainBike mountainBike = new MountainBike(3, 25, 10);
            mountainBike.bicycleDesc();
            mountainBike.speedUp(15);
            mountainBike.applyBrake(7);
            mountainBike.bicycleDesc();
            mountainBike.setHeight(15);
            System.out.println("Updated seat height: " + mountainBike.seatHeight);
        }

    }












