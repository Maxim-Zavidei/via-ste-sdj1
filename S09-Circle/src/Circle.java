public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(0);
    }

    private double getArea() {
        return Math.PI * radius * radius;
    }

    private double getRadius() {
        return radius;
    }

    public boolean greaterThan(Circle comparedToCircle) {
        return radius < comparedToCircle.radius;
    }

    @Override
    public String toString() {
        return "Radius= " + radius + ", Area= " + getArea();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) return false;
        Circle other = (Circle) obj;
        return radius == other.radius;
    }
}
