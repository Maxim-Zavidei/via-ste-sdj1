import java.util.ArrayList;

public class ApartmentComplex {

    private String address;
    private ArrayList<Apartment> apartments;

    public ApartmentComplex(String address) {
        this.address = address;
        apartments = new ArrayList<>();
    }

    public void add(Apartment apartment) {
        apartments.add(apartment);
    }

    public Apartment getApartment(int index) {
        return apartments.get(index);
    }

    public Apartment getApartmentByNumber(int number) {
        for (Apartment apartment : apartments) if (apartment.getNumber() == number) return apartment;
        return null;
    }

    public Apartment getApartmentByTenant(Tenant tenant) {
        for (Apartment apartment : apartments) if (!apartment.isAvailable() && apartment.getTenant().equals(tenant)) return apartment;
        return null;
    }

    public Apartment getFirstAvailableApartment() {
        for (Apartment apartment : apartments) if (apartment.isAvailable()) return apartment;
        return null;
    }

    @Override
    public String toString() {
        return "{" + "Address:" + address + ", Apartments=" + apartments.toString() + '}';
    }
}
