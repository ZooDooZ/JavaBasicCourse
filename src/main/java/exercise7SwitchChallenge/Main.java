package exercise7SwitchChallenge;

public class Main {
    public static void main(String[] args) {

        int monthNum = 5;

        switch (monthNum){
            case 3:
            case 4:
            case 5:
                System.out.println("Wiosna");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Lato");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Jesien");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Zima");
                break;
            default:
                System.out.println("Default: " + monthNum);
                break;
        }
    }
}
