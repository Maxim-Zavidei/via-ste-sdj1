public class Engine {

    private String type;
    private int horsePower;
    private int volume;
    private boolean isDiesel;

    public Engine(String type, int horsePower, int volume, boolean isDiesel) {
        this.type = type;
        this.horsePower = horsePower;
        this.volume = volume;
        this.isDiesel = isDiesel;
    }

    public Engine(String type, int horsePower, int volume) {
        this.type = type;
        this.horsePower = horsePower;
        this.volume = volume;
        this.isDiesel = true;
    }

    public String getType() {
        return this.type;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean isDiesel() {
        return this.isDiesel;
    }

    @Override
    public String toString() {
        return "Type: " + this.type + ", Horse Power: " + this.horsePower + ", Volume: " + this.volume + ", Is diesel: " + this.isDiesel;
    }
}
