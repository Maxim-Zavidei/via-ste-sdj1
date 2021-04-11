public class Colour {

    private int red;
    private int green;
    private int blue;

    public Colour(int red, int green, int blue) {
        set(red, green, blue);
    }

    public void set(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public boolean isGray() {
        return red == green && red == blue;
    }

    public void mixWith(Colour colour2) {
        red = (int) ((0.5) * (red + colour2.red));
        green = (int) ((0.5) * (green + colour2.green));
        blue = (int) ((0.5) * (blue + colour2.blue));
    }

    public Colour copy() {
        return new Colour(red, green, blue);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Colour)) return false;
        Colour other = (Colour) obj;
        return red == other.red && green == other.green && blue == other.blue;
    }

    @Override
    public String toString() {
        return "{red= " + red + ", green= " + green + ", blue= " + blue + "}";
    }
}
