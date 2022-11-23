package exercise30GenericTypes.Task1Square;

public class Main {
    public static void main(String[] args) {

        Square<Integer> numberInt = new Square<>(10);
        System.out.println(numberInt.getSurfaceArea());

        Square<Float> numberFloat = new Square<>(5.7f);
        System.out.printf("%.2f",numberFloat.getSurfaceArea());
    }
}
