package exercise22AbstractChallenge;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Filip","Sok","Java");
        Employee employee1 = new Programmer("John", "Lenon", "C#");

        System.out.println(programmer);
        System.out.println(employee1);

        System.out.println(employee1 instanceof Employee); //true
        System.out.println(employee1 instanceof Programmer); //true
    }
}
