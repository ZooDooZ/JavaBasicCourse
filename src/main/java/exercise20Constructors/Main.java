package exercise20Constructors;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Tom","Riddle","Math");
        Student student1 = new Student("Harry", "Potter", 5);
        Director director1 = new Director("Albus", "Dumbledore","GEOGRAPHY", 2);

        System.out.println(student1);
        System.out.println();
        System.out.println(teacher1);
        System.out.println();
        System.out.println(director1);

        System.out.println(student1.getNumId());
        System.out.println(teacher1.getNumId());
        System.out.println(director1.getNumId());

    }
}
