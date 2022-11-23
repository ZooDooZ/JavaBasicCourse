package exercise25MyOwnException.Exercise3;

public class MinusException extends Exception{

    public MinusException(){
        super("Przekazana została liczba ujemna.");
    }
}
