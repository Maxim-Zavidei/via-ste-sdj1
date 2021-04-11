public class Vehicle {

    private String owner;
    private double price;

    public Vehicle(String owner, double price) {
        setOwner(owner);
        setPrice(price);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle:{owner=" + owner + ", price=" + price + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Vehicle)) return false;
        Vehicle other = (Vehicle) obj;
        return owner.equals(other.owner) && price == other.price;
    }
}
