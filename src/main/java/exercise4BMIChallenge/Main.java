package exercise4BMIChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        System.out.println("Enter your weight(egz. 70,5): ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height(egz. 1,75): ");
        float height = scanner.nextFloat();

        float bmi = (float)weight / (float)(Math.pow(height,height));

        System.out.println(String.format("Your BMI is: %.2f",bmi));
        System.out.println("Integer bmi: " + (int)bmi);
    }
}
