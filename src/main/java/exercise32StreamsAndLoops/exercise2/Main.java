package exercise32StreamsAndLoops.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Zadanie 2.
         * Napisz program, który odbiera rozmiar tablicy (n) od użytkownika (System.in). Następnie
         * odbierz n liczb od użytkownika i umieść je w tablicy. Zaimplementuj algorytm
         * sortowania bąbelkowego, aby posortować tę tablicę w porządku rosnącym.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter (number) length of array:");
        int numberLengthArray = scanner.nextInt();

        int[] array = new int[numberLengthArray];

        for(int i = 0; i < array.length; i++){
            System.out.println("Enter array element:");
            array[i] = scanner.nextInt();
        }

        bubbleSort(array);
    }

    private static void bubbleSort(int array[]){
        int temporary;

        while(true){
            for(int i = 0 ; i < array.length-1; i++){
                if(array[i] > array[i+1]){
                    temporary = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temporary;
                }
            }
            break;
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
