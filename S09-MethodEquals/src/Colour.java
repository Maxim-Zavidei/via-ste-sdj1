public class Colour {

    private int red;
    private int green;
    private int blue;

    public Colour(int red, int green, int blue) {
        if (red < 0) red = 0;
        if (green < 0) green = 0;
        if (blue < 0) blue = 0;
        if (red > 255) red = 255;
        if (green > 255) green = 255;
        if (blue > 255) blue = 255;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Colour(String hex) {
        hex = hex.toUpperCase();
        for (int i = 0; i < hex.length(); i++) if (!(('0' <= hex.charAt(i) && hex.charAt(i) <= '9') || ('A' <= hex.charAt(i) && hex.charAt(i) <= 'F') || hex.charAt(i) == '#')) {
            hex = "#000000";
            break;
        }
        this.red = hexToDecimal(hex.substring(1, 3));
        this.green = hexToDecimal(hex.substring(3, 5));
        this.blue = hexToDecimal(hex.substring(5, 7));
    }

    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.green;
    }

    public int getBlue() {
        return this.blue;
    }

    public static String decimalToHex(int decimalValue) {
        return decimalValue <= 0 ? "0" : decimalValue < 16 ? "" + "0123456789ABCDEF".charAt(decimalValue) : decimalToHex(decimalValue / 16) + "0123456789ABCDEF".charAt(decimalValue % 16);
    }

    public static int hexToDecimal(String hexValue) {
        if (hexValue.isEmpty()) return 0;
        return hexToDecimal(hexValue.substring(0, hexValue.length() - 1)) * 16 + "0123456789ABCDEF".indexOf(hexValue.charAt(hexValue.length() - 1));
    }

    public String toHex() {
        StringBuilder toReturn = new StringBuilder();
        String temp = decimalToHex(this.red);
        toReturn.append("#").append(temp.length() == 1 ? "0" + temp : temp);
        temp = decimalToHex(this.green);
        toReturn.append(temp.length() == 1 ? "0" + temp : temp);
        temp = decimalToHex(this.blue);
        toReturn.append(temp.length() == 1 ? "0" + temp : temp);
        return toReturn.toString();
    }

    @Override
    public String toString() {
        return "red= " + red + ", green= " + green + ", blue= " + blue;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Colour)) return false;
        Colour other = (Colour) obj;
        return red == other.red && green == other.green && blue == other.blue;
    }
}
