package exercise6TernaryChallenge;

public class Main {
    public static void main(String[] args) {

        int number = 10;

        String result = number % 2 == 0 ? "Parzysta" : "Nieparzysta";
        System.out.println(result);
    }
}
