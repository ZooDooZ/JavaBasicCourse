package exercise25MyOwnException.Exercise2;

public class BankAccount {

    private double balance;

    public BankAccount(double amount) throws IllegalArgumentException{
        if(amount < 0){
            throw new IllegalArgumentException();
        }
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }
}
