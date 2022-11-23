package exercise25MyOwnException.Exercise1;

/**
 * Napisz metodę, która szuka konkretnej wartości w tablicy liczb. Metoda ta
 * powinna zwracać indeks elementu zawierającego tę wartość (jeśli został on
 * znaleziony). Jeżeli wartości nie znaleziono, metoda powinna zgłaszać wyjątek
 * klasy Exception z komunikatem "Elementu nie znaleziono.".
 */

public class Main {

    public static class MyException extends Exception {
        public MyException(){
            super("Elementu nie znaleziono");
        }
    }
    public static void main(String[] args) {

        try {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int number = findNumber(numbers, 10);
            System.out.println(number);
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

    public static int findNumber(int[] numbers, int number) throws MyException {
        int counter = 0;
        boolean isFind = true;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == number) {
                counter = i;
                isFind = true;
                break;
            } else {
                isFind = false;
            }
        }
        if(!isFind){
            throw new MyException();
        }

        return counter;
    }
}
