package exercise20Constructors;

public final class Director extends Teacher{

    private int numTermsOffice;

    public Director(String name, String surname, String teachingSub, int numTermsOffice) {
        super(name, surname, teachingSub);
        this.numTermsOffice = numTermsOffice;
    }

    public int getNumTermsOffice() {
        return numTermsOffice;
    }

    public void setNumTermsOffice(int numTermsOffice) {
        this.numTermsOffice = numTermsOffice;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of terms of office: " + numTermsOffice;
    }
}
