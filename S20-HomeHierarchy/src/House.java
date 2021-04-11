public class House extends Home {

    private double price;

    public House(String address, double price) {
        super(address);
        this.price = price;
    }

    public String getInfo() {
        return "{Address= " + super.getAddress() + ", House, price= " + price + "}";
    }

    @Override
    public String toString() {
        return super.toString() + "->House{" + "price=" + price + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof House)) return false;
        House other = (House) obj;
        return super.equals(obj) && price == other.price;
    }
}
