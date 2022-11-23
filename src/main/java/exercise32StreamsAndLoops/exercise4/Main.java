package exercise32StreamsAndLoops.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Zadanie 4.
         * Napisz metodę, która konwertuje wszystkie ciągi z listy na wielkie litery za pomocą
         * strumieni.
         */

        List<String> texts = new ArrayList<>();
        texts.add("Programowanie");
        texts.add("To");
        texts.add("Czarna");
        texts.add("Magia");

        Main.upperCaseConverter(texts);

    }

    public static void upperCaseConverter(List<String> texts){
        texts.stream()
                .map(str -> str.toUpperCase())
                .forEach(str -> System.out.print(str + " "));
    }
}
