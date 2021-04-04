public class CarTest {
    public static void main(String[] args) {

        Car carObj = new Car("Porsche", "Z-900", "red", true);

        System.out.println();
        System.out.println("Original car object data:");
        System.out.println("getMake= " + carObj.getMake());
        System.out.println("getModel= " + carObj.getModel());
        System.out.println("getColour= " + carObj.getColour());
        System.out.println("hasManualGear= " + carObj.hasManualGear());
        System.out.println("toString: " + carObj.toString());

        carObj.setColour("Cyan");

        System.out.println();
        System.out.println("Changed car object data:");
        System.out.println("getColour= " + carObj.getColour());
        System.out.println("toString: " + carObj.toString());
    }
}
