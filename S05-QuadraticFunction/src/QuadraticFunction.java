public class QuadraticFunction {

    private double a;
    private double b;
    private double c;

    public QuadraticFunction(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getValue(double x) {
        return a * x * x + b * x + c;
    }

    public String getRoots() {
        if (a != 0) {
            double determinant = Math.pow(b, 2) - 4 * a * c;
            if (determinant >= 0) {
                double x = (-b - Math.sqrt(determinant)) / (2 * a);
                double y = (-b + Math.sqrt(determinant)) / (2 * a);
                return determinant == 0 ? "One root: " + String.format("%1$,.2f", x) : "Two roots: " + (x < y ? String.format("%1$,.2f; %2$,.2f", x, y) : String.format("%1$,.2f; %2$,.2f", y, x)) + ")";
            } else return "No roots.";
        } else return b == 0 ? c == 0 ? "Not a quadratic function: Infinite number of roots." : "Not a quadratic function: No roots." : "A linear function with root: " + String.format("%1$,.2f", -c / b);
    }
}
