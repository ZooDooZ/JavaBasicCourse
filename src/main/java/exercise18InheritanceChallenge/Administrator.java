package exercise18InheritanceChallenge;

public class Administrator extends Employee{

    String certificates;

    Administrator(String name, String surname,String certificates){
        super(name, surname);
        this.certificates = certificates;
    }

    public void printInfo(){
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nCertificates: " + certificates);
    }

}
