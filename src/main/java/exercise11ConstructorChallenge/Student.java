package exercise11ConstructorChallenge;


public class Student {

    String name;
    String surname;
    String city;
    int age;

    public Student(){
        this.name = "Jan";
        this.surname = "Kowalski";
        this.city = "Karkow";
        this.age = 19;
    }

    public Student(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }

    public void printBasicData(){
        System.out.println("Name: " + name + "\nSurname: " + surname + "\nCity: " + city + "\nAge: " + age);
    }


}
