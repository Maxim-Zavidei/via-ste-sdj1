public class OrderLine {

    private int amount;
    private Product product;

    public OrderLine(int amount, Product product) {
        this.amount = amount;
        this.product = product.copy();
    }

    public int getAmount() {
        return amount;
    }

    public Product getProduct() {
        return product.copy();
    }

    public double getPrice() {
        return product.getPrice() * amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof OrderLine)) return false;
        OrderLine other = (OrderLine) obj;
        return amount == other.amount && product.getName().equals(other.getProduct().getName()) && product.getPrice() == other.getProduct().getPrice();
    }

    public OrderLine copy() {
        return new OrderLine(amount, product);
    }
}
