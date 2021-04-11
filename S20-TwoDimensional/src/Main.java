public class Main {
    public static void main(String[] args) {

        TwoDimensionalShape[] shapes = new TwoDimensionalShape[] {
            new Circle(2, 2, 5),
            new Rectangle(2, 2, 5, 8),
            new Triangle(2, 2, 5, 6, 5)
        };

        for (TwoDimensionalShape shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.equals(new Rectangle(2, 2, 5, 8)));
        }
    }
}
