package exercise26Files.SerializableObject;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String surname;
    private int studyYear;
    private String studyType;

    public Student(String name, String surname, int studyYear, String studyType) {
        this.name = name;
        this.surname = surname;
        this.studyYear = studyYear;
        this.studyType = studyType;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public String getStudyType() {
        return studyType;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studyYear=" + studyYear +
                ", studyType='" + studyType + '\'' +
                '}';
    }
}
