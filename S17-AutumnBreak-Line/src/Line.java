public class Line {

    private String colour;
    private Point pointA;
    private Point pointB;

    public Line(Point pointA, Point pointB, String colour) {
        setPointA(pointA);
        setPointB(pointB);
        setColour(colour);
    }

    public Line(Point pointA, Point pointB) {
        this(pointA, pointB, "black");
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA.copy();
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB.copy();
    }

    public String getColour() {
        return colour;
    }

    public Point getPointA() {
        return pointA.copy();
    }

    public Point getPointB() {
        return pointB.copy();
    }

    public double getLength() {
        return Math.sqrt(Math.pow((pointB.getX() - pointA.getX()), 2) + Math.pow((pointB.getY() - pointA.getY()), 2));
    }

    @Override
    public String toString() {
        return "A " + colour + " line from (" + pointA.getX() + ", " + pointB.getX() + ") to (" + pointA.getY() + ", " + pointB.getY() + ") with length equal to " + String.format("%.2f", getLength());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Line)) return false;
        Line other = (Line) obj;
        return colour.equals(other.colour) && (pointA.equals(other.pointA) && pointB.equals(other.pointB) || pointA.equals(other.pointB) && pointB.equals(other.pointA));
    }

    public double getSlope() {
        return (pointB.getY() - pointA.getY()) / (pointB.getX() - pointA.getX());
    }

    public double getYIntercept() {
        return pointA.getY() - getSlope() * pointA.getX();
    }

    public String getSlopeIntercept() {
        return "y = " + String.format("%.2f", getSlope()) + "x + " + String.format("%.2f", getYIntercept());
    }

    public boolean equalSlopeIntercept(Line other) {
        return getSlope() == other.getSlope() && getYIntercept() == other.getYIntercept();
    }
}
