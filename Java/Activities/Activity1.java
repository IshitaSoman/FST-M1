package Activities;

public class Activity1 extends Car {

    public static void main(String[] args) {

        Car c1=new Car();
        c1.make=2014;
        c1.colour="Red";
        c1.transmission="Manual";

c1.displayCharacteristic();
c1.accelerate();
c1.brake();

    }


}
