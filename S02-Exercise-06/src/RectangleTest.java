import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle= ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the rectangle= ");
        double width = input.nextDouble();

        Rectangle rectangleObj = new Rectangle(length, width);

        System.out.println("The length of the rectangle is: " + rectangleObj.getLength());

        System.out.println("The width of the rectangle is: " + rectangleObj.getWidth());

        System.out.println("The area of the rectangle is: " + rectangleObj.getArea());

        input.close();
    }
}
