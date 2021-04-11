public class Bicycle extends Vehicle {

    private int gears;

    public Bicycle(String theOwner, double price, int numberOfGears) {
        super(theOwner, price);
        setGears(numberOfGears);
    }

    public void setGears(int numberOfGears) {
        gears = numberOfGears;
    }

    public int getGears() {
        return gears;
    }

    @Override
    public String toString() {
        return super.toString() + "->Bicycle:{gears=" + gears + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Bicycle)) return false;
        Bicycle other = (Bicycle) obj;
        return super.equals(obj) && gears == other.gears;
    }
}
