package exercise11ConstructorChallenge;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("Filip", "Sok", "Kielce", 26);

        student1.printBasicData();
        student2.printBasicData();

    }
}
