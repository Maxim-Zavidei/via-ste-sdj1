public class TestLine {
    public static void main(String[] args) {

        Line line = new Line(new Point(1, 0), new Point(0, -1), "red");
        Line line2 = new Line(new Point(1, 0), new Point(-1, 0), "red");
        Line line3 = new Line(new Point(2, 1), new Point(3, 2), "red");

        System.out.println(line.getColour());
        System.out.println(line.getPointA());
        System.out.println(line.getPointB());
        System.out.println(line.getLength());
        System.out.println(line);
        System.out.println(line.equals(line2));
        System.out.println(line.getSlope());
        System.out.println(line.getYIntercept());
        System.out.println(line.getSlopeIntercept());
        System.out.println(line.equalSlopeIntercept(line3));
    }
}
