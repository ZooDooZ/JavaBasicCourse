package exercise13RetunMethodChallenge;

import java.util.Random;

public class CarFactory {

    CarFactory(){

    }

    public Car buildCar(){
        String[] colors = {"black", "white", "red", "blue"};
        int randIndex = (int)(Math.random() * colors.length);
        System.out.println(randIndex);
        String randColor = colors[randIndex];

        return new Car("Ford", "Mustang", randColor);
    }
}
