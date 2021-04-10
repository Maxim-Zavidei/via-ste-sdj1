public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product copy() {
        return new Product(name, price);
    }

    @Override
    public String toString() {
        return "name= " + name + ", price= " + price;
    }
}
