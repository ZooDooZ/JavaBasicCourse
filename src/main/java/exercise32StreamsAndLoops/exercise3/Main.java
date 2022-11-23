package exercise32StreamsAndLoops.exercise3;


import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


public class Main {
    public static void main(String[] args) {

        /**
         * Zadanie 3.
         * Napisz metodę, która zwraca średnią z listy liczb całkowitych za pomocą strumieni.
         */

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(Main.getAvg(numbers));
    }

    public static OptionalDouble getAvg(List<Integer> numbers){
        return numbers.stream().mapToDouble(a -> a).average();
    }
}
