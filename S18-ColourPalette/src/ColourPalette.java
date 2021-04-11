public class ColourPalette {

    private int numberOfColours;
    private Colour[] palette;

    public ColourPalette(int maxNumberOfColours) {
        numberOfColours = 0;
        palette = new Colour[maxNumberOfColours];
    }

    public int getNumberOfColours() {
        return numberOfColours;
    }

    public void add(Colour colour) {
        palette[numberOfColours++] = colour.copy();
    }

    public Colour get(int index) {
        return palette[index].copy();
    }

    public int getNumberOfGrayColours() {
        int counter = 0;
        for (Colour colour : palette) if (colour.isGray()) counter++;
        return counter;
    }

    public void mixColour(int index, Colour colour) {
        palette[index].mixWith(colour);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ColourPalette)) return false;
        ColourPalette other = (ColourPalette) obj;
        if (numberOfColours != other.numberOfColours) return false;
        for (int i = 0; i < numberOfColours; i++) if (!palette[i].equals(other.palette[i])) return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder("Palette:{");
        for (int i = 0; i < numberOfColours - 1; i++) {
            toReturn.append(palette[i]).append(", ");
        }
        return toReturn.append(palette[numberOfColours - 1]).append("}").toString();
    }
}
