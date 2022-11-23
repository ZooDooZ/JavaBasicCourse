package exercise18InheritanceChallenge;

public class Employee {
    String name;
    String surname;

    Employee(){
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printInfo(){
        System.out.println("Name: " + name + "\nSurname: " + surname);
    }
}
