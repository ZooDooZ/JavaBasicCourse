package exercise25MyOwnException.Exercise5;

public class InvalidTestScore extends Exception{

    public InvalidTestScore(){
        super("Niepoprawny wynik któregos z testów!");
    }
}
