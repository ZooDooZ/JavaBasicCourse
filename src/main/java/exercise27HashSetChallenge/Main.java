package exercise27HashSetChallenge;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        /**
        * 1. Stwórz HashSet z typem String i dodaj do niego następujące imiona:
         *   Ola, Kasia, Daniel, Ola, Kasia, Adam. Na koniec wyświetl wszystkie elementy
         *   w konsoli.
         */

        HashSet<String> names = new HashSet<>();
        names.add("Ola");
        names.add(new String("Kasia"));
        names.add("Daniel");
        names.add("Ola");
        names.add("Kasia");
        names.add("Adam");

        for(String name : names){
            System.out.println(name);
        }


        System.out.println();


        Iterator<String> iNames = names.iterator();

        while(iNames.hasNext()){
            String str = iNames.next();
            System.out.println(str);
        }


        /**
         * 2. Dodaj klasę Car z polem name typu String oraz konstruktorem,
         *    getterem, setterem i metodą toString().
         *    Stwórz HashSet z typem Car i dodaj dwa razy tą samą instancję dla 3 nazw
         *    aut: "Dodge", "Citroen", "Opel". Wyświetl rezultat w konsoli.
         */
        System.out.println();

        HashSet<Car> cars = new HashSet<>();

        cars.add(new Car("Citroen", "C5"));
        cars.add(new Car("Citroen", "C5"));
        cars.add(new Car("Dodge", "Mission"));
        cars.add(new Car("Dodge","City"));
        cars.add(new Car("Opel","Vectra"));
        cars.add(new Car("Opel","Micra"));

        for(Car car : cars){
            System.out.println(car);
        }
    }
}
