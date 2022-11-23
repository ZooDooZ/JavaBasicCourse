package exercise19AccessModifier;

public class MotorBike extends Bike{

    public MotorBike(String brand, String name){
        super(brand, name);
        setType("MotorBike");
    }

    public void printInfo(){
        System.out.println("Motorbike: ");
        super.printInfo();
    }


}
