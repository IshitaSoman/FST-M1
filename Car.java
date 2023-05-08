package Activities;
public class Car {

        String colour;
        String transmission;
        int make;
        int tyres;
        int doors;

        Car()
        {
            tyres=4;
            doors=4;
        }
        public void displayCharacteristic(){

            System.out.println("Activities.Activity1.Car Colour:" +colour);
            System.out.println("Activities.Activity1.Car transmission:" +transmission);
            System.out.println("Activities.Activity1.Car make:" +make);
            System.out.println("Activities.Activity1.Car tyres:" +tyres);
            System.out.println("Activities.Activity1.Car doors:" +doors);

        }

        public void accelerate(){

            System.out.println("Activities.Activity1.Car is moving forward");
        }

        public void brake(){

            System.out.println("Activities.Activity1.Car has stopped");
        }




}
