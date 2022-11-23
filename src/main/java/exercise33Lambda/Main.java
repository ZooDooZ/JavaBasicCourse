package exercise33Lambda;

public class Main {
    public static void main(String[] args) {

        MathInterface mathInterface = (a,b)-> (a+b);

        System.out.println("Add result (from abstract method): " + mathInterface.operate(100, 20));
        System.out.println(mathInterface.add(50, 50));
        System.out.println(mathInterface.subtract(50,50));

        try{
            int divide = MathInterface.divide(10,0);
            System.out.println(divide);
        } catch (Exception e){
            System.out.println("You can't divine by 0!");
        } finally {
            System.out.println("Finally always do!");
        }

        MathCalculation mathCalculation = new MathCalculation();
        System.out.println(mathCalculation.operate(10, 10));
    }
}
