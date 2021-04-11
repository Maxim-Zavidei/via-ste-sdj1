public class Circle extends TwoDimensionalShape {

    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) return false;
        Circle other = (Circle) obj;
        return super.equals(obj) && radius == other.radius;
    }

    @Override
    public String toString() {
        return super.toString() + "->Circle:{radius= " + radius + "}";
    }
}
