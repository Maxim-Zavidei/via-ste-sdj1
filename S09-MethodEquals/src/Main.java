public class Main {
    public static void main(String[] args) {

        Address addressObj = new Address("sdfasdf", "sdfadsf", 2, 'B', 4, "c");
        Clock clockObj = new Clock(10, 43, 0);
        DriversLicense driversLicenseObj = new DriversLicense(1111, true, true);
        Engine engineObj = new Engine("Type", 110, 100, false);
        MyDate myDateObj = new MyDate(3, 10, 2020);
        Name nameObj = new Name("first", "last");
        Person personObj = new Person('F');
        Colour colourObj = new Colour(57, 89, 25);

        System.out.println("addressObj.equals= " + addressObj.equals(new Address("fsdfasd", "fasdfa", 2, 'G', 1, "c")));
        System.out.println("clockObj.equals= " + clockObj.equals(new Clock(10, 43, 0)));
        System.out
                .println("driversLicenseObj.equals= " + driversLicenseObj.equals(new DriversLicense(1111, true, true)));
        System.out.println("engineObj.equals= " + engineObj.equals(new Engine("Type", 110, 100, false)));
        System.out.println("myDateObj.equals= " + myDateObj.equals(new MyDate(3, 10, 2020)));
        System.out.println("nameObj.equals= " + nameObj.equals(new Name("first", "last")));
        System.out.println("personObj.equals= " + personObj.equals(new Person('F')));
        System.out.println("colourObj.equals= " + colourObj.equals(new Colour(57, 89, 25)));
    }
}
