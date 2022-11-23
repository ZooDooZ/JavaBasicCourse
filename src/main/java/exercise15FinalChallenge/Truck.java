package exercise15FinalChallenge;

public class Truck {

    String manufacturer;
    String model;
    int wheels = 4;
    String color;
    final float TOP_SPEED = 100;
    final float ACCELERATION;

    Truck(){
        this.manufacturer = "Freightliner";
        this.model = "9664";
        this.wheels = 6;
        this.ACCELERATION = 60;
    }

    Truck(String color){
        this();
        this.color = color;
    }

    public void printInfo(){
        System.out.println("Manufacturer: " + manufacturer + "\nModel: " + model + "\nColor: " + color);
    }
}
