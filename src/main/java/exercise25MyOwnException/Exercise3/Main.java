package exercise25MyOwnException.Exercise3;

/**
 * Napisz klasę wyjątków, którą można stosować w sytuacji, gdy do metody
 * przekazana zostanie liczba ujemna.
 * Napisz instrukcję, która zgłasza wyjątek.
 */
public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

//        double result1 = calculator.addNumbers(5,5);
//        System.out.println(result1);

        try {
            double result2 = calculator.addNumbers(-2, 6);
            System.out.println(result2);
        }catch (MinusException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Dalsze instrukcje ;)");

    }
}
