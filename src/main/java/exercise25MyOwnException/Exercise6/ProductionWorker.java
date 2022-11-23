package exercise25MyOwnException.Exercise6;

public class ProductionWorker extends Employee {

    private int shift;
    private double hourlyRate;

    public ProductionWorker(){

    }

    public ProductionWorker(String name, String employeeId, String dateOfEmployment, int shift, double hourlyRate) throws InvalidShift, InvalidPayRate, InvalidEmployeeNumber {
        super(name, employeeId, dateOfEmployment);
        if(shift < 1 || shift > 2){
            throw new InvalidShift();
        }
        this.shift = shift;

        if(hourlyRate < 10 || hourlyRate > 50){
            throw new InvalidPayRate();
        }
        this.hourlyRate = hourlyRate;
    }

    public int getShift() {
        return shift;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void printYourShift(int shift){
        if(shift == 1){
            System.out.println("Dzienna zmiana.");
        } else if (shift == 2){
            System.out.println("Nocna zmiana.");
        } else {
            System.out.println("Błąd!");
        }
    }

    public String toString() {
        return super.toString() + "\nShift: " + shift + "\nHourly pay rate: " + hourlyRate;
    }
}