public class Main {
    public static void main(String[] args) {

        Order testOrder = new Order();

        testOrder.addProduct(5, new Product("banana", 6.4));
        testOrder.addProduct(3, new Product("bread", 2.3));

        System.out.println(testOrder.getNumberOfOrderLines());
        System.out.println(testOrder.getOrderLine(1));
        System.out.println(testOrder.getTotalPrice());
    }
}
