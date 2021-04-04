public class Address {

    private String town;
    private String street;
    private int number;
    private char letter;
    private int floor;
    private String door;

    public Address(String town, String street, int number, char letter, int floor, String door) {
        this.town = town;
        this.street = street;
        this.number = number;
        this.letter = letter;
        this.floor = floor;
        this.door = door;
    }

    public String getTown() {
        return this.town;
    }

    public String getStreet() {
        return this.street;
    }

    public int getNumber() {
        return this.number;
    }

    public char getLetter() {
        return this.letter;
    }

    public int getFloor() {
        return this.floor;
    }

    public String getDoor() {
        return this.door;
    }

    public String getFullNumber() {
        return "Number " + this.number + ", Letter " + this.letter + ", Floor " + this.floor + ", Door " + this.door;
    }

    @Override
    public String toString() {
        return "Town " + this.town + ", Street " + this.street + ", " + getFullNumber();
    }
}
