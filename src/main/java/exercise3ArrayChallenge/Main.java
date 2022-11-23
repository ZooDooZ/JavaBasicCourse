package exercise3ArrayChallenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Filip", "Ania", "Daniel", "Wojtek", "Camaro"};

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your number(Remember that you have indeks number from 0 to " + (names.length-1) + "): ");
        try {
            String numberS = bf.readLine();
            int numberI = Integer.parseInt(numberS);
            String name = names[numberI];
            System.out.println("Array index " + numberI + " has the value " + name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
