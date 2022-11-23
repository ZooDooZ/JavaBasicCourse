package exercise25MyOwnException.Exercise4;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 1.Metoda getValueFromFile jest publiczna i zwraca wartość typu int. Nie przyjmuje
 * żadnych argumentów. Ta metoda może zgłaszać wyjątki typów IOException
 * i FileNotFoundException. Napisz jej nagłówek.
 *
 * 2.Napisz instrukcję try, która wywołuje metodę getValueFromFile opisaną
 * w zadaniu numer 7. Koniecznie zadbaj o obsługę wszystkich wyjątków, jakie
 * ta metoda może zgłaszać.
 */
public class Main {

    public static class DataBase{
        public int getValueFromFile() throws FileNotFoundException, IOException {
            return 0;
        }
    }
    public static void main(String[] args) {

        try{
            DataBase dataBase = new DataBase();
            int value = dataBase.getValueFromFile();
            System.out.println(value);
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
