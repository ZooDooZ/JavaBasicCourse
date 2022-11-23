package exercise1SimpleAndComplexType;

public class Main {
    public static void main(String[] args) {

        float deposit = 1000.00f;
        float numDays = 180;
        float interestRate = 0.06f;
        final float daysInYear = 365;
        float tax = 0.19f;

        float interest = deposit * numDays * interestRate / daysInYear;
        float taxValue = interest * tax;
        float profit = interest - taxValue;
        System.out.printf("Profit from this account: %.2f", profit);



    }
}
