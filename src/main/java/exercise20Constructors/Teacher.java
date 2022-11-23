package exercise20Constructors;

public class Teacher extends Person{

    private String teachingSub;

    public Teacher(String name, String surname, String teachingSub) {
        super(name, surname);
        this.setTeachingSub(teachingSub);
    }

    public String getTeachingSub() {
        return teachingSub;
    }

    public void setTeachingSub(String teachingSub) {
        teachingSub = teachingSub.toLowerCase();

        switch (teachingSub) {
            case "math":
            case "biology":
            case "PE":
            case "history":
            case "geography":
                this.teachingSub = teachingSub;
                break;
            default:
                this.teachingSub = "unknown";
                break;
        }
    }

    public String toString(){
        return super.toString() + "\nTeaching subject: " + teachingSub;
    }
}
