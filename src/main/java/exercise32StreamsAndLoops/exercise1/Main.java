package exercise32StreamsAndLoops.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * 1.Odwróć liczbę za pomocą pętli while.
         * Program poprosi użytkownika o wprowadzenie numeru,
         * a następnie odwróci liczbę za
         * pomocą pętli while.
         */
        Scanner scanner = new Scanner(System.in);

        boolean looper = true;

        while(looper) {
            System.out.println("Enter your number (exit = 0):");
            double number = scanner.nextDouble();
            if (number == 0) {
                looper = false;
                continue;
            }
            System.out.printf("%.2f\n", 1 / number);
        }
    }
}
