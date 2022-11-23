package exercise2StringChallenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.println("Enter your name: ");
            String name = bf.readLine();

            System.out.println("Enter your town: ");
            String town = bf.readLine();

            String information = name + " mieszka w " + town;
            System.out.println(information);
            System.out.println("This string has " + information.length() + " signs.");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
