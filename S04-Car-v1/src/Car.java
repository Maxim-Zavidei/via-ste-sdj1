public class Car {

    private String make;
    private String model;
    private String colour;
    private boolean manualGear;

    public Car(String make, String model, String colour, boolean manualGear) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.manualGear = manualGear;
    }

    public void setColour(String colour) {
        this.colour = colour;
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

    public boolean hasManualGear() {
        return this.manualGear;
    }

    @Override
    public String toString() {
        return "Make=" + this.make + ", Model=" + this.model + ", Colour=" + this.colour + ", ManualGear=" + this.manualGear;
    }
}
