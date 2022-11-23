package exercise5Operators;

public class Main {
    public static void main(String[] args) {

        double avg = (1 + 2 + 3 + 4) / (double)4;
        System.out.println("Avarage is: " + avg);

        double avgDec = 10 + avg++;
        System.out.println(avgDec); // 12,5


        double avgInc = 10 + ++avg;
        System.out.println(avgInc); //14,5 - becouse avg was 3,5 after avg++

    }
}
