package exercise25MyOwnException.Exercise6;

public class InvalidShift extends Exception{

    public InvalidShift(){
        super("Invalid shift range!");
    }
}
