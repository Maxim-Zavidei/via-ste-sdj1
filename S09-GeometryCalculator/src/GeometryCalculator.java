import java.util.Scanner;

public class GeometryCalculator {

    public static double areaOfCircle(double radius) {
        if (radius < 0) {
            System.out.println("Radius can't be negative.");
            return -1;
        }
        return Math.PI * radius * radius;
    }

    public static double areaOfRectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Length and width can't be negative.");
            return -1;
        }
        return length * width;
    }

    public static double areaOfTriangle(double base, double height) {
        if (base < 0 || height < 0) {
            System.out.println("Base and height can't be negative.");
            return -1;
        }
        return base * height * 0.5;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer;

        while (true) {
            System.out.println("Geometry Calculator");
            System.out.println("1. Calculate the Area of a Circle");
            System.out.println("2. Calculate the Area of a Rectangle");
            System.out.println("3. Calculate the Area of a Triangle");
            System.out.println("4. Quit");
            System.out.println();
            System.out.print("Enter your choice (1-4): ");

            while (true) {
                answer = in.nextInt();
                if (0 < answer && answer < 5) break;
                System.out.print("Invalid input, chose again: ");
            }
            if (answer == 4) break;

            double inputA;
            double inputB;
            double output;
            if (answer == 1) {
                while (true) {
                    System.out.print("Enter the radius of the circle: ");
                    inputA = in.nextDouble();
                    output = areaOfCircle(inputA);
                    if (output != -1) {
                        System.out.println("The area of the cricle is: " + output);
                        break;
                    }
                }
            } else if (answer == 2) {
                while (true) {
                    System.out.print("Enter the length of the rectangle: ");
                    inputA = in.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    inputB = in.nextDouble();
                    output = areaOfRectangle(inputA, inputB);
                    if (output != -1) {
                        System.out.println("The area of the rectangle is: " + output);
                        break;
                    }
                }
            } else {
                while (true) {
                    System.out.print("Enter the base of the triangle: ");
                    inputA = in.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    inputB = in.nextDouble();
                    output = areaOfTriangle(inputA, inputB);
                    if (output != -1) {
                        System.out.println("The area of the triangle is: " + output);
                        break;
                    }
                }
            }
            System.out.println();
        }
        in.close();
    }
}
