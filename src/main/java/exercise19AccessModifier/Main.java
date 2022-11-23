package exercise19AccessModifier;

public class Main {
    public static void main(String[] args) {

        Bike bike = new Bike("Junak", "Karling");
        MotorBike motorBike = new MotorBike("ZHY45","Wierchowina");

        bike.printInfo();
        motorBike.printInfo();

    }
}
