public class Circle {

    private double radius;
    private Point centerPoint;

    public Circle(double radius, Point centerPoint) {
        this.radius = radius;
        this.centerPoint = centerPoint.copy();
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenterPoint() {
        return centerPoint.copy();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void moveTo(Point centerPoint) {
        this.centerPoint.moveTo(centerPoint.getX(), centerPoint.getY());
    }

    @Override
    public String toString() {
        return "Radius=" + radius + ", centerPoint=" + centerPoint;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) return false;
        Circle other = (Circle) obj;
        return radius == other.radius && centerPoint.equals(other.centerPoint);
    }
}
