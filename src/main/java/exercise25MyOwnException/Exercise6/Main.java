package exercise25MyOwnException.Exercise6;

public class Main {
    public static void main(String[] args) throws InvalidPayRate, InvalidShift, InvalidEmployeeNumber {

        ProductionWorker productionWorker1 = new ProductionWorker("John", "993-C",
                "12.09.2010",1,56);

        System.out.println(productionWorker1);
    }
}
