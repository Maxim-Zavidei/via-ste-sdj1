public class Person {

    private String name;
    private House house;

    public Person(String name) {
        this.name = name;
        this.house = null;
    }

    public void moveTo(House house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return house.getAddress().getStreetAndNumber();
    }

    public String getTown() {
        return house.getAddress().getTown();
    }
}
