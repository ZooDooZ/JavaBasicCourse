package exercise18InheritanceChallenge;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Lenon");
        Administrator administrator1 = new Administrator("Elon", "Musk", "Administrator");
        Programmer programmer1 = new Programmer("Filip", "Sok", "Java");

        employee1.printInfo();
        administrator1.printInfo();
        programmer1.printInfo();
    }
}
