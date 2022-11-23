package exercise24TryCatchChallenge;

public class Main {
    public static void main(String[] args) {

//        try{
//            int  result = 10 / 0;
//        } catch (ArithmeticException e){
//            e.printStackTrace();
//        } finally {
//            System.out.println("This code is done");
//        }

//        try {
//           divine(10,0);
//        } catch (MyException e){
//            e.printStackTrace();
//        } finally {
//            System.out.println("Don't divine by 0!");
//        }

        try{
            System.out.println(addNumbers(6, 4));
        } catch (FiveException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }



    }

    public static double divine(double a, double b) throws MyException{
        if(b == 0) throw new MyException("Divide by 0!");
        return a / b;
    }

    public static double addNumbers(int a, int b) throws FiveException{
        if(a == 5 || b == 5) throw new FiveException("Don't use number - '5'");
        return a + b;
    }
}
