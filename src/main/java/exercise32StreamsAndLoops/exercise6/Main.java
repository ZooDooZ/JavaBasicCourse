package exercise32StreamsAndLoops.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Zadanie 6.
         * Napisz metodę, która zwraca łańcuch rozdzielany przecinkami na podstawie podanej
         * listy liczb całkowitych. Każdy element powinien być poprzedzony literą „e”, jeśli liczba
         * jest parzysta, i poprzedzona literą „o”, jeśli liczba jest nieparzysta. Na przykład, jeśli lista
         * danych wejściowych to (3,44), wynikiem powinno być „o3, e44”. Użyj strumieni.
         */

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<String> stringList = Main.oddEvenConv(numbers);
        System.out.println(stringList);
    }

    public static List<String> oddEvenConv(List<Integer> numbers) {

        List<String> oeConverted = new ArrayList<>();
        numbers.stream().map(Object::toString)
                .toList().forEach(a ->
                        oeConverted.add(Integer.parseInt(a) % 2 == 0 ? String.format("e%s", a) : String.format("o%s", a)));
        return oeConverted;
    }

}
