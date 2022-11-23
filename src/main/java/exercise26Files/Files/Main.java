package exercise26Files.Files;


import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("files\\text.txt");

        if(!file.exists()){
            if(file.createNewFile()) {
                System.out.println("Utworzono plik.");
            } else {
                System.out.println("Plik juz istnieje.");
            }
        }

        System.out.println("Czy można przeczyta plik? " + file.canRead());
        System.out.println("Czy można zapisac w pliku? " + file.canWrite());
        System.out.println("Nazwa pliku: " + file.getName());
        System.out.println("Sciezka pliku: " + file.getPath());
        System.out.println("Pelna sciezka pliku: " + file.getAbsolutePath());
        System.out.println("Nazwa folderu w jakim znajduje się dany plik: " + file.getParent());
        System.out.println("Czy plik jest ukryty? " + file.isHidden());
        System.out.println("Czy to jest plik? " + file.isFile());
        System.out.println("Czy to jest katalog? " + file.isDirectory());
        long lastModified = file.lastModified();
        System.out.println("Ostatnia modyfikacja pliku: " + (new Date(lastModified)));
        System.out.println("Rozmiar pliku: " + file.length());

    }
}
