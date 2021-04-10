import java.util.ArrayList;

public class Order {

    private ArrayList<OrderLine> orderLines;

    public Order() {
        orderLines = new ArrayList<>();
    }

    public void addProduct(int amount, Product product) {
        orderLines.add(new OrderLine(amount, product));
    }

    public int getNumberOfOrderLines() {
        return orderLines.size();
    }

    public OrderLine getOrderLine(int index) {
        return orderLines.get(index);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (OrderLine orderLine : orderLines) totalPrice += orderLine.getPrice();
        return totalPrice;
    }
}
