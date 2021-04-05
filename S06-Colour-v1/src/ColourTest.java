public class ColourTest {
    public static void main(String[] args) {

        Colour colourObj = new Colour("#222222");

        System.out.println("getRed= " + colourObj.getRed());
        System.out.println("getGreen= " + colourObj.getGreen());
        System.out.println("getBlue= " + colourObj.getBlue());
        System.out.println("toHex= " + colourObj.toHex());
        System.out.println("toString: " + colourObj.toString());
    }
}
