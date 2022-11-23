package exercise21PolymprphismChallenge;


public class Flat {

    private String city;
    private String street;

    public Flat(){
    }

    public Flat(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return String.format("Type: %s | City: %s | Street: %s",getClass().getSimpleName(), city, street);
    }
}
