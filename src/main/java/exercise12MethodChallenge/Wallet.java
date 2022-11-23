package exercise12MethodChallenge;

public class Wallet {

    float money;

    public Wallet(){
        money = 3000.0f;
    }

    public void addMoney(float amount){
        money += amount;
    }

    public void removeMoney(float amount){
        money -= amount;
    }

    public void printAmount(){
        System.out.println(money);
    }
}
