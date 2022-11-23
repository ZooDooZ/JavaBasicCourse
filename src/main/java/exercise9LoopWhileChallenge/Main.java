package exercise9LoopWhileChallenge;

public class Main {
    public static void main(String[] args) {

        // while loop
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        int counter = 0;
//
//        while(counter < numbers.length){
//            System.out.println("Number: " + numbers[counter] + " * 2  = " + numbers[counter]*2);
//            counter++;
//        }

        // do while loop
//        int number = 0;
//
//        do{
//            if(!(number % 2 == 0)) {
//                System.out.println(number);
//            }
//            number++;
//        } while(number < 20);
//
//        System.out.println("Koniec");



        for(int i = 0; i <= 100; i++){
            System.out.println(i);
            if(i == 5){
                break;
            }
        }

        int a = 10;

        while(a > 0){
            System.out.println(a);
            a--;

            if(a == 2){
                break;
            }
        }
        System.out.println("Petla while zakonczona!");

    }
}
