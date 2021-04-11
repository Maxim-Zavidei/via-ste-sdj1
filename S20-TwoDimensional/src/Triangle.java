public class Triangle extends TwoDimensionalShape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double x, double y, double sideA, double sideB, double sideC) {
        super(x, y);
        setSides(sideA, sideB, sideC);
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSides(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * sideB * Math.sin(Math.acos((sideA * sideA + sideB * sideB - sideC * sideC) / (2 * sideA * sideB)));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Triangle)) return false;
        Triangle other = (Triangle) obj;
        return super.equals(obj) && sideA == other.sideA && sideB == other.sideB && sideC == other.sideC;
    }

    @Override
    public String toString() {
        return super.toString() + "->Triangle:{sideA= " + sideA + ", sideB= " + sideB + ", sideC= " + sideC + "}";
    }
}
