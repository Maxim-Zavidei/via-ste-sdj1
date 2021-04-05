public class Main {
    public static void main(String[] args) {

        Circle circleObj = new Circle(2);
        System.out.println(circleObj);
        System.out.println("greaterThen? : " + circleObj.greaterThan(new Circle(3)));
    }
}
