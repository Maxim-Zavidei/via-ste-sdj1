public class Rectangle extends TwoDimensionalShape {

    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        setSides(width, height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setSides(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) obj;
        return super.equals(obj) && width == other.width && height == other.height;
    }

    @Override
    public String toString() {
        return super.toString() + "->Rectangle:{width= " + width + ", height= " + height + "}";
    }
}
