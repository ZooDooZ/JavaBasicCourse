package exercise14RoadsterChallenge;

public class Main {
    public static void main(String[] args) {

        Roadster car1 = new Roadster(250.0f, 4.0f);

        System.out.println("Car1 top speed: " + car1.getTopSpeed());
        System.out.println("Car1 acceleration: " + car1.getAcceleration());

        Roadster car2 = new Roadster(250.0f, 4.0f, 300.0f, 1.9f);
        System.out.println("Car2 crazy top speed: " + car2.getTopSpeed(true));
    }
}
