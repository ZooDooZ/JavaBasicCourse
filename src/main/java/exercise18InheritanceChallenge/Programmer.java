package exercise18InheritanceChallenge;

public class Programmer extends Employee{

    String languages;


    public Programmer(String name, String surname, String languages) {
        super(name, surname);
        this.languages = languages;
    }

    public void printInfo(){
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nLanguages: " + languages);
    }
}
