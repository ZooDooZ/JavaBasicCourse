package exercise32StreamsAndLoops.exercise5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Zadanie 5.
         * Mając listę stringów, napisz metodę, która zwraca listę wszystkich ciągów zaczynających
         * się na literę „a” (małe litery) i zawierających dokładnie 3 litery, użyj strumieni.
         */

        List<String> texts = new ArrayList<>();
        texts.add("ola");
        texts.add("ala");
        texts.add("ole");
        texts.add("ata");
        texts.add("lok");
        texts.add("ass");
        texts.add("pol");

        Main.threeLetterSortingStartByLetterA(texts);

    }

    public static void threeLetterSortingStartByLetterA(List<String> texts){
        texts.stream()
                .filter(str ->str.startsWith("a") && str.length() == 3)
                .forEach(System.out::println);

    }
}
