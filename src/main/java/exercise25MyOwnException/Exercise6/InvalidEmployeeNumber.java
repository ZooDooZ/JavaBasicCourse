package exercise25MyOwnException.Exercise6;

public class InvalidEmployeeNumber extends Exception{

    public InvalidEmployeeNumber(){
        super("Invalid employee number!");
    }
}
