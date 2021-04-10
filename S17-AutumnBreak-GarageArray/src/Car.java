public class Car {

    private String make;
    private String model;
    private String colour;
    private boolean manualGear;
    private Engine engine;

    public Car(String make, String model, String colour, boolean manualGear, Engine engine) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.manualGear = manualGear;
        this.engine = engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public boolean hasManualGear() {
        return this.manualGear;
    }

    public int getHorsePower() {
        return this.engine.getHorsePower();
    }

    @Override
    public String toString() {
        return "Make=" + this.make + ", Model=" + this.model + ", Colour=" + this.colour + ", ManualGear=" + this.manualGear + ", Engine:" + this.engine;
    }
}
