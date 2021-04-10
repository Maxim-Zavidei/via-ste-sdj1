public class Main {
    public static void main(String[] args) {

        ApartmentComplex testComplex = new ApartmentComplex("TestComplex");
        testComplex.add(new Apartment(0));
        testComplex.add(new Apartment(1));
        testComplex.add(new Apartment(2));
        testComplex.add(new Apartment(3));
        testComplex.add(new Apartment(4));
        testComplex.add(new Apartment(5));
        testComplex.add(new Apartment(6));
        testComplex.add(new Apartment(7));
        testComplex.add(new Apartment(8));
        testComplex.add(new Apartment(9));
        testComplex.add(new Apartment(10));

        testComplex.getApartment(0).rentTo(new Tenant("Tenant0"), new MyDate(8, 10, 2020));
        testComplex.getApartment(1).rentTo(new Tenant("Tenant1"), new MyDate(9, 10, 2020));
        Tenant tenant2 = new Tenant("Tenant2");
        tenant2.setRentedFrom(new MyDate(10, 10, 2019));
        testComplex.getApartment(2).rentTo(tenant2, new MyDate(10, 10, 2019));
        testComplex.getApartment(3).rentTo(new Tenant("Tenant3"), new MyDate(11, 10, 2018));
        testComplex.getApartment(4).rentTo(new Tenant("Tenant4"), new MyDate(12, 10, 2000));
        testComplex.getApartment(5).rentTo(new Tenant("Tenant5"), new MyDate(13, 10, 2020));
        testComplex.getApartment(6).rentTo(new Tenant("Tenant6"), new MyDate(14, 10, 2008));
        testComplex.getApartment(7).rentTo(new Tenant("Tenant7"), new MyDate(15, 10, 2020));

        System.out.println("getApartment(2)= " + testComplex.getApartment(2));
        System.out.println("getApartment(3)= " + testComplex.getApartment(3));
        System.out.println("getApartmentByNumber(5)= " + testComplex.getApartmentByNumber(5));
        System.out.println("getApartmentByTenant= " + testComplex.getApartmentByTenant(tenant2));
        System.out.println("getFirstAvailableApartment=" + testComplex.getFirstAvailableApartment());
    }
}
