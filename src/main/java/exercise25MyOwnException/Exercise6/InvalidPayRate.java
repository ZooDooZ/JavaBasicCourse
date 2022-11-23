package exercise25MyOwnException.Exercise6;

public class InvalidPayRate extends Exception{

    public InvalidPayRate(){
        super("Invalid range of pay rate per hour!");
    }

}
