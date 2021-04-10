public class Address {

    private String streetAndNumber;
    private String town;

    public Address(String streetAndNumber, String town) {
        set(streetAndNumber, town);
    }

    public void set(String streetAndNumber, String town) {
        this.streetAndNumber = streetAndNumber;
        this.town = town;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public String getTown() {
        return town;
    }

    public Address copy() {
        return new Address(streetAndNumber, town);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Address)) return false;
        Address other = (Address) obj;
        return streetAndNumber.equals(other.streetAndNumber) && town.equals(other.town);
    }
}
