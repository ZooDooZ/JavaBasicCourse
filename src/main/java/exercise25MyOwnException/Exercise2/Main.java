package exercise25MyOwnException.Exercise2;

/**
 * Napisz instrukcję, która zgłasza wyjątek typu IllegalArgumentException
 * z komunikatem "Argument nie może być wartością ujemną.".
 */
public class Main {
    public static void main(String[] args) {

        try{
            BankAccount account = new BankAccount(-200);
            System.out.println(account.getBalance());
        } catch (IllegalArgumentException e){
            System.out.println("Argument nie moze byc wartoscia ujemna.");
        }
    }
}
