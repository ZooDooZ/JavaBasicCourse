package exercise12MethodChallenge;

public class Main {
    public static void main(String[] args) {

        Wallet myWallet = new Wallet();

        for(int i = 0; i < 6; i++){
            myWallet.addMoney(5000);
            myWallet.removeMoney(2000);
            myWallet.removeMoney(1000);
        }

        System.out.println("Your actually wallet condition after 6 months: ");
        myWallet.printAmount();

    }
}
