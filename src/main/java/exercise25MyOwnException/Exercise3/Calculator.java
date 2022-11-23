package exercise25MyOwnException.Exercise3;

public class Calculator {

    public double addNumbers(double a, double b) throws MinusException {
        if(a < 0 || b < 0){
            throw new MinusException();
        }
        return a + b;
    }
}
