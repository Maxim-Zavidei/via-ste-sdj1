public class CarTest {
    public static void main(String[] args) {

        Engine firstEngine = new Engine("4-cylinder", 500, 800, false);
        Car carObj = new Car("Porsche", "Z-100", "red", true, firstEngine);

        System.out.println();
        System.out.println("Original car object data:");
        System.out.println("getMake= " + carObj.getMake());
        System.out.println("getModel= " + carObj.getModel());
        System.out.println("getColour= " + carObj.getColour());
        System.out.println("hasManualGear= " + carObj.hasManualGear());
        System.out.println("getEngine: " + carObj.getEngine());
        System.out.println("getHorsePower= " + carObj.getHorsePower());
        System.out.println("toString: " + carObj.toString());

        Engine secondEngine = new Engine("8-cylinder", 1000, 700, false);
        carObj.setEngine(secondEngine);

        System.out.println();
        System.out.println("Modified car object data:");
        System.out.println("getEngine: " + carObj.getEngine());
        System.out.println("getHorsePower= " + carObj.getHorsePower());
        System.out.println("toString: " + carObj.toString());
    }
}
