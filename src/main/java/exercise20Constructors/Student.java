package exercise20Constructors;

public class Student extends Person{

    private int studyYear;


    public Student(String name, String surname, int studyYear) {
        super(name, surname);
        this.studyYear = studyYear;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudy year: " + studyYear;
    }
}
