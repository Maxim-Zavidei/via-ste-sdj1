public class TestCircle {
    public static void main(String[] args) {

        Circle circleObj = new Circle(2, new Point(4, 5));
        System.out.println("getRadius= " + circleObj.getRadius());
        System.out.println("getCenterPoint= " + circleObj.getCenterPoint());
        System.out.println("getArea= " + circleObj.getArea());
        System.out.println(circleObj);
        circleObj.moveTo(new Point(7, 8));
        System.out.println(circleObj);
        System.out.println("equals?: " + circleObj.equals(new Circle(2, new Point(4, 8))));
    }
}
