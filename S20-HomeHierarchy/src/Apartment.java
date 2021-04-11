public class Apartment extends Home {

    private double rent;

    public Apartment(String address, double rent) {
        super(address);
        this.rent = rent;
    }

    public String getInfo() {
        return "{Address= " + super.getAddress() + ", Apartment, rent= " + rent + "}";
    }

    @Override
    public String toString() {
        return super.toString() + "->Apartment{" + "rent=" + rent + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Apartment)) return false;
        Apartment other = (Apartment) obj;
        return super.equals(obj) && rent == other.rent;
    }
}
