package exercise25MyOwnException.Exercise6;

public class Employee {
    private String name;
    private String employeeId;
    private String dateOfEmployment;

    public Employee(){

    }

    public Employee(String name, String employeeId, String dateOfEmployment) throws InvalidEmployeeNumber {
        this.name = name;

        String[] str = employeeId.split("-");
        employeeId = str[0];
        char letter = str[1].toLowerCase().charAt(0);
        int employeeIdNumber = Integer.parseInt(employeeId);
        if(employeeIdNumber < 0 || employeeIdNumber > 999 || letter > 'm' || letter < 'a'){
            throw new InvalidEmployeeNumber();
        }

        this.employeeId = employeeId;
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    @Override
    public String toString() {
        return "Employee name: " + name + "\nEmployee ID: " + employeeId + "\nDate of employment: " + dateOfEmployment;
    }
}
