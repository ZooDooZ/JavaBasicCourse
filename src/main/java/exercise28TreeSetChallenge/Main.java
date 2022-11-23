package exercise28TreeSetChallenge;

import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        Random random = new Random();
        int counter = 0;
        for(int i = 0; i < 30; i++){
            counter++;
            Integer num = random.nextInt(101);
            numbers.add(num);
            System.out.println("Liczba numer " + counter +": " + num);
        }
        System.out.println();

        int counter1 = 0;
        for(Integer number : numbers){
            counter1++;
            System.out.println("Liczba numer " + counter1 +": " + number);
        }
    }
}
