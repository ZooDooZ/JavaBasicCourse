package exercise21PolymprphismChallenge;

public class House extends Flat{

    private float parcelSize;

    public House(String city, String street, float parcelSize) {
        super(city, street);
        this.parcelSize = parcelSize;
    }

    public float getParcelSize() {
        return parcelSize;
    }

    public void setParcelSize(float parcelSize) {
        this.parcelSize = parcelSize;
    }

    @Override
    public String toString() {
        return String.format("%s | Parcel size: %.1fm2" ,super.toString(), parcelSize);
    }
}
