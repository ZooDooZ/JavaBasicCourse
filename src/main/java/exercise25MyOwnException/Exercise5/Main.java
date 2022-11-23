package exercise25MyOwnException.Exercise5;

/**
 * 1. Klasa TestScores
 * Napisz klasę TestScores (wyniki testów). Konstruktor w tej klasie powinien przyjmować
 * jako argument tablicę wyników testów. W klasie powinna znajdować się metoda
 * zwracająca średnią wyników testów. Jeśli któryś z wyników w tablicy jest ujemny lub
 * wyższy od 100, klasa powinna zgłaszać wyjątek typu IllegalArgumentException. Zilustruj
 * działanie tej klasy w programie
 *
 * 2. Niestandardowa klasa wyjątków dla klasy TestScores
 * Napisz klasę wyjątków InvalidTestScore. Zmodyfikuj klasę TestScores napisaną
 * w zadaniu 1., aby zgłaszała wyjątek typu InvalidTestScore, jeśli któryś z wyników
 * w tablicy jest niepoprawny.
 */
public class Main {
    public static void main(String[] args) throws InvalidTestScore {

        double[] testResults = {56.5, 68.9, 34.6, 85.2, 101, 34, 45};

        TestScores testScores = new TestScores(testResults);
        System.out.println(testScores.getAverageFromTest());
    }
}
