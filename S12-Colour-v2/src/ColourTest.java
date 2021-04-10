public class ColourTest {
    public static void main(String[] args) {

        Colour colourObj = new Colour("#222222");

        System.out.println("getRed= " + colourObj.getRed());
        System.out.println("getGreen= " + colourObj.getGreen());
        System.out.println("getBlue= " + colourObj.getBlue());
        System.out.println("toHex= " + colourObj.toHex());
        System.out.println("toString: " + colourObj.toString());

        Colour colour0 = new Colour("#000000");
        System.out.println("colour0= " + colour0.getName());
        Colour colour1 = new Colour(Colour.COLOUR_CODES[3]);
        System.out.println("colour1= " + colour1.getName());
        Colour colour2 = new Colour("#000044");
        System.out.println("colour2= " + colour2.getName());
    }
}
