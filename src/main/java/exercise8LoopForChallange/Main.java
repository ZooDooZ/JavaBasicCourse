package exercise8LoopForChallange;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Piotr", "Wojtek", "Michal", "Marek", "Karolina", "Michalina"};

        //wypisanie wartości po kolei od indeksu 0
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println();

        //wypisanie wartości po końca od indeksu names.length()-1
        for(int i = names.length-1; i >= 0; i--){
            System.out.println(names[i]);
        }
    }
}
