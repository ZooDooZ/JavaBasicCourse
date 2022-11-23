package exercise25MyOwnException.Exercise5;


public class TestScores {

    private double[] testResults;


    public TestScores(double[] testResults){
        this.testResults = testResults;
    }

    public double getAverageFromTest() throws InvalidTestScore {
        double sum = 0;
        double avg = 0;
        for(int i = 0; i < testResults.length; i++){
            if(testResults[i] < 0 || testResults[i] > 100){
                throw new InvalidTestScore();
            } else {
                sum += testResults[i];
            }
            avg = sum / testResults.length;
        }
        return avg;
    }
}
