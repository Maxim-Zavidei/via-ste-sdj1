public class Colour {

    private int red;
    private int green;
    private int blue;
    public final static String[] COLOUR_NAMES = {
            "Black", "Navy blue", "Blue 4", "Medium blue", "Blue 2", "Blue 1",
            "Dark green", "Deep skyblue 4", "Turquoise 4", "Green 4", "Spring green 4", "Cyan 4", "Deep skyblue 3",
            "Deep skyblue 2", "Deep skyblue 1", "Turquoise 3", "Green 3", "Spring green 3", "Cyan 3", "Dark turquoise",
            "Turquoise 2", "Green 2", "Spring green 2", "Cyan 2", "Turquoise 1", "Medium spring green", "Green 1",
            "Spring green 1", "Cyan 1", "Gray 1", "Gray 2", "Gray 3", "Gray 4", "Gray 5", "Gray 6", "Dodger blue 4",
            "Gray 7", "Gray 8", "Gray 9", "Dodger blue 3", "Midnight blue", "Gray 10", "Gray 11", "Dodger blue 2",
            "Dodger blue 1", "Gray 12", "Light seagreen", "Gray 13", "Forest green", "Gray 14", "Gray 15",
            "Royal blue 4", "Gray 16", "Gray 17", "Gray 18", "Sea green 4", "Dark slategray", "Gray 19", "Lime green",
            "Gray 20", "Gray 21", "Steel blue 4", "Gray 22", "Royal blue 3", "Gray 23", "Medium seagreen", "Gray 24",
            "Gray 25", "Turquoise", "Royal blue", "Gray 26", "Royal blue 2", "Sea green 3", "Gray 27", "Chartreuse 4",
            "Aquamarine 4", "Steel blue", "Slate blue 4", "Gray 28", "Dark slateblue", "Royal blue 1",
            "Medium turquoise", "Gray 29", "Sky blue 4", "Gray 30", "Sea green 2", "Gray 31", "Steel blue 3", "Gray 32",
            "Dark slategray 4", "Cadet blue 4", "Gray 33", "Pale green 4", "Sea green 1", "Purple 4", "Dark olivegreen",
            "Gray 34", "Gray 35", "Gray 36", "Steel blue 2", "Medium purple 4", "Gray 37", "Cadet blue",
            "Light skyblue 4", "Gray 38", "Gray 39", "Steel blue 1", "Cornflower blue", "Rebeccapurple", "Gray 40",
            "Pale turquoise 4", "Chartreuse 3", "Medium", "Medium aquamarine", "Dark orchid 4", "Light blue 4",
            "Slate blue 3", "Dim gray", "Gray 41", "Olive drab 4", "Dark seagreen 4", "Slate blue", "Gray 42",
            "Olive drab", "Slate gray 4", "Sky blue 3", "Gray 43", "Light steelblue 4", "Dark olivegreen 4", "Gray 44",
            "Slate gray", "Gray 45", "Gray 46", "Chartreuse 2", "Aquamarine 2", "Light slategray", "Gray 47",
            "Dark slategray 3", "Medium orchid 4", "Slate blue 2", "Gray 48", "Light cyan 4", "Cadet blue 3",
            "Medium slateblue", "Pale green 3", "Lawn green", "Purple 3", "Gray 49", "Sky blue 2", "Gray 50",
            "Chartreuse 1", "Aquamarine 1", "Gray 51", "Slate blue 1", "Honeydew 4", "Azure 4", "Light slateblue",
            "Gray 52", "Gray 53", "Sky blue", "Light skyblue", "Sky blue 1", "Medium purple 3", "Blue violet",
            "Gray 54", "Red 4", "Magenta 4", "Deep pink 4", "Firebrick 4", "Maroon 4", "Violet red 4", "Brown 4",
            "Orange red 4", "Tomato 4", "Indian red 4", "Hot pink 4", "Coral 4", "Dark orange 4", "Saddle brown",
            "Sienna 4", "Pale violetred 4", "Orchid 4", "Salmon 4", "Light salmon 4", "Orange 4", "Tan 4",
            "Light pink 4", "Pink 4", "Dark goldenrod 4", "Plum 4", "Goldenrod 4", "Rosy brown 4", "Burlywood 4",
            "Gold 4", "Peach puff 4", "Navajo white 4", "Thistle 4", "Bisque 4", "Misty rose 4", "Wheat 4",
            "Light goldenrod 4", "Antique white 4", "Lavender blush 4", "Khaki 4", "Seashell 4", "Cornsilk 4",
            "Lemon chiffon 4", "Snow 4", "Yellow 4", "Light yellow 4", "Ivory 4", "Gray 55", "Light skyblue 3",
            "Dark slategray 2", "Cadet blue 2", "Gray 56", "Dark seagreen", "Pale green 2", "Purple 2", "Gray 57",
            "Medium purple", "Dark violet", "Gray 58", "Gray 59", "Pale turquoise 3", "Dark slategray 1",
            "Cadet blue 1", "Pale green", "Dark orchid", "Gray 60", "Dark orchid 3", "Light blue 3", "Yellow green",
            "Pale green 1", "Purple 1", "Dark seagreen 3", "Gray 61", "Gray 62", "Medium purple 2", "Slate gray 3",
            "Purple", "Sienna", "Gray 63", "Light steelblue 3", "Dark olivegreen 3", "Gray 64", "Light skyblue 2",
            "Brown", "Gray 65", "Gray 66", "Medium purple 1", "Gray 67", "Gray 68", "Light blue", "Green yellow",
            "Pale turquoise 2", "Pale turquoise", "Maroon", "Gray 69", "Light steelblue", "Powder blue",
            "Light skyblue 1", "Firebrick", "Dark orchid 2", "Light blue 2", "Gray 70", "Olive drab 2",
            "Medium orchid 3", "Light cyan 3", "Dark seagreen 2", "Gray 71", "Dark goldenrod", "Gray 72",
            "Slate gray 2", "Medium orchid", "Gray 73", "Pale turquoise 1", "Rosy brown", "Light steelblue 2",
            "Dark olivegreen 2", "Dark khaki", "Gray 74", "Gray", "Dark orchid 1", "Gray 75", "Light blue 1",
            "Olive drab 1", "Honeydew 3", "Azure 3", "Dark seagreen 1", "Gray 76", "Gray 77", "Slate gray 1",
            "Medium violetred", "Gray 78", "Gray 79", "Light steelblue 1", "Dark olivegreen 1", "Gray 80", "Red 3",
            "Magenta 3", "Deep pink 3", "Firebrick 3", "Maroon 3", "Violet red 3", "Brown 3", "Orange red 3",
            "Tomato 3", "Indian red 3", "Coral 3", "Indian red", "Hot pink 3", "Dark orange 3", "Chocolate 3",
            "Sienna 3", "Pale violetred 3", "Orchid 3", "Salmon 3", "Light salmon 3", "Orange 3", "Tan 3",
            "Light pink 3", "Pink 3", "Dark goldenrod 3", "Plum 3", "Goldenrod 3", "Rosy brown 3", "Burlywood 3",
            "Gold 3", "Peach puff 3", "Navajo white 3", "Thistle 3", "Bisque 3", "Misty rose 3", "Wheat 3",
            "Light goldenrod 3", "Antique white 3", "Lavender blush 3", "Seashell 3", "Khaki 3", "Cornsilk 3",
            "Lemon chiffon 3", "Snow 3", "Yellow 3", "Light yellow 3", "Ivory 3", "Gray 81", "Violet red",
            "Medium orchid 2", "Gray 82", "Light cyan 2", "Chocolate", "Tan", "Light gray", "Gray 83", "Gray 84",
            "Thistle", "Gray 85", "Orchid", "Goldenrod", "Pale", "Pale violetred", "Gray 86", "Gainsboro", "Plum",
            "Burlywood", "Gray 87", "Medium orchid 1", "Gray 88", "Honeydew 2", "Azure 2", "Light cyan 1", "Gray 89",
            "Gray 90", "Lavender", "Gray 91", "Dark salmon", "Gray 92", "Gray 93", "Red 2", "Magenta 2", "Deep pink 2",
            "Firebrick 2", "Maroon 2", "Violet red 2", "Brown 2", "Orange red 2", "Tomato 2", "Indian red 2", "Coral 2",
            "Hot pink 2", "Dark orange 2", "Chocolate 2", "Sienna 2", "Pale violetred 2", "Orchid 2", "Salmon 2",
            "Violet", "Light salmon 2", "Orange 2", "Tan 2", "Light pink 2", "Pink 2", "Dark goldenrod 2", "Plum 2",
            "Goldenrod 2", "Rosy brown 2", "Burlywood 2", "Gold 2", "Peach puff 2", "Navajo white 2", "Thistle 2",
            "Bisque 2", "Misty rose 2", "Wheat 2", "Light goldenrod 2", "Light", "Antique white 2", "Lavender blush 2",
            "Seashell 2", "Khaki 2", "Pale goldenrod", "Cornsilk 2", "Lemon chiffon 2", "Snow 2", "Yellow 2",
            "Light yellow 2", "Ivory 2", "Light coral", "Khaki", "Gray 94", "Alice blue", "Honeydew 1", "Azure 1",
            "Gray 95", "Sandy brown", "Wheat", "Beige", "White smoke", "Mint cream", "Gray 97", "Ghost white", "Salmon",
            "Antique white", "Linen", "Light goldenrodyellow", "Gray 98", "Gray 99", "Old lace", "Red 1", "Magenta",
            "Deep pink 1", "Firebrick 1", "Maroon 1", "Violet red 1", "Brown 1", "Orange red 1", "Tomato 1", "Hot pink",
            "Indian red 1", "Hot pink 1", "Coral 1", "Dark orange 1", "Chocolate 1", "Coral", "Sienna 1",
            "Pale violetred 1", "Orchid 1", "Dark orange", "Salmon 1", "Light salmon 1", "Orange 1", "Tan 1",
            "Light pink 1", "Pink 1", "Light pink", "Dark goldenrod 1", "Plum 1", "Pink", "Goldenrod 1", "Rosy brown 1",
            "Burlywood 1", "Gold 1", "Peach puff 1", "Navajo white 1", "Thistle 1", "Moccasin", "Bisque 1",
            "Misty rose 1", "Wheat 1", "Blanched almond", "Light goldenrod 1", "Papaya whip", "Antique white 1",
            "Lavender blush 1", "Seashell 1", "Khaki 1", "Cornsilk 1", "Lemon chiffon 1", "Floral white", "Snow 1",
            "Yellow 1", "Light yellow 1", "Ivory 1", "White" };

    public final static String[] COLOUR_CODES = {
            "#000000", "#000080", "#00008B", "#0000CD", "#0000EE", "#0000FF", "#FFFF00", "#FFFFE0", "#FFFFF0",
            "#006400", "#00688B", "#00868B", "#008B00", "#008B45", "#008B8B", "#009ACD", "#00B2EE", "#00BFFF",
            "#00C5CD", "#00CD00", "#00CD66", "#00CDCD", "#00CED1", "#00E5EE", "#00EE00", "#00EE76", "#00EEEE",
            "#00F5FF", "#00FA9A", "#00FF00", "#00FF7F", "#00FFFF", "#030303", "#050505", "#080808", "#0A0A0A",
            "#0D0D0D", "#0F0F0F", "#104E8B", "#121212", "#141414", "#171717", "#1874CD", "#191970", "#1A1A1A",
            "#1C1C1C", "#1C86EE", "#1E90FF", "#1F1F1F", "#20B2AA", "#212121", "#228B22", "#242424", "#262626",
            "#27408B", "#292929", "#2B2B2B", "#2E2E2E", "#2E8B57", "#2F4F4F", "#303030", "#32CD32", "#333333",
            "#363636", "#36648B", "#383838", "#3A5FCD", "#3B3B3B", "#3CB371", "#3D3D3D", "#404040", "#40E0D0",
            "#4169E1", "#424242", "#436EEE", "#43CD80", "#454545", "#458B00", "#458B74", "#4682B4", "#473C8B",
            "#474747", "#483D8B", "#4876FF", "#48D1CC", "#4A4A4A", "#4A708B", "#4D4D4D", "#4EEE94", "#4F4F4F",
            "#4F94CD", "#525252", "#528B8B", "#53868B", "#545454", "#548B54", "#54FF9F", "#551A8B", "#556B2F",
            "#575757", "#595959", "#5C5C5C", "#5CACEE", "#5D478B", "#5E5E5E", "#5F9EA0", "#607B8B", "#616161",
            "#636363", "#63B8FF", "#6495ED", "#663399", "#666666", "#668B8B", "#66CD00", "#66CDAA", "#66CDAA",
            "#68228B", "#68838B", "#6959CD", "#696969", "#696969", "#698B22", "#698B69", "#6A5ACD", "#6B6B6B",
            "#6B8E23", "#6C7B8B", "#6CA6CD", "#6E6E6E", "#6E7B8B", "#6E8B3D", "#707070", "#708090", "#737373",
            "#757575", "#76EE00", "#76EEC6", "#778899", "#787878", "#79CDCD", "#7A378B", "#7A67EE", "#7A7A7A",
            "#7A8B8B", "#7AC5CD", "#7B68EE", "#7CCD7C", "#7CFC00", "#7D26CD", "#7D7D7D", "#7EC0EE", "#7F7F7F",
            "#7FFF00", "#7FFFD4", "#828282", "#836FFF", "#838B83", "#838B8B", "#8470FF", "#858585", "#878787",
            "#87CEEB", "#87CEFA", "#87CEFF", "#8968CD", "#8A2BE2", "#8A8A8A", "#8B0000", "#8B008B", "#8B0A50",
            "#8B1A1A", "#8B1C62", "#8B2252", "#8B2323", "#8B2500", "#8B3626", "#8B3A3A", "#8B3A62", "#8B3E2F",
            "#8B4500", "#8B4513", "#8B4726", "#8B475D", "#8B4789", "#8B4C39", "#8B5742", "#8B5A00", "#8B5A2B",
            "#8B5F65", "#8B636C", "#8B6508", "#8B668B", "#8B6914", "#8B6969", "#8B7355", "#8B7500", "#8B7765",
            "#8B795E", "#8B7B8B", "#8B7D6B", "#8B7D7B", "#8B7E66", "#8B814C", "#8B8378", "#8B8386", "#8B864E",
            "#8B8682", "#8B8878", "#8B8970", "#8B8989", "#8B8B00", "#8B8B7A", "#8B8B83", "#8C8C8C", "#8DB6CD",
            "#8DEEEE", "#8EE5EE", "#8F8F8F", "#8FBC8F", "#90EE90", "#912CEE", "#919191", "#9370DB", "#9400D3",
            "#949494", "#969696", "#96CDCD", "#97FFFF", "#98F5FF", "#98FB98", "#9932CC", "#999999", "#9A32CD",
            "#9AC0CD", "#9ACD32", "#9AFF9A", "#9B30FF", "#9BCD9B", "#9C9C9C", "#9E9E9E", "#9F79EE", "#9FB6CD",
            "#A020F0", "#A0522D", "#A1A1A1", "#A2B5CD", "#A2CD5A", "#A3A3A3", "#A4D3EE", "#A52A2A", "#A6A6A6",
            "#A8A8A8", "#AB82FF", "#ABABAB", "#ADADAD", "#ADD8E6", "#ADFF2F", "#AEEEEE", "#AFEEEE", "#B03060",
            "#B0B0B0", "#B0C4DE", "#B0E0E6", "#B0E2FF", "#B22222", "#B23AEE", "#B2DFEE", "#B3B3B3", "#B3EE3A",
            "#B452CD", "#B4CDCD", "#B4EEB4", "#B5B5B5", "#B8860B", "#B8B8B8", "#B9D3EE", "#BA55D3", "#BABABA",
            "#BBFFFF", "#BC8F8F", "#BCD2EE", "#BCEE68", "#BDB76B", "#BDBDBD", "#BEBEBE", "#BF3EFF", "#BFBFBF",
            "#BFEFFF", "#C0FF3E", "#C1CDC1", "#C1CDCD", "#C1FFC1", "#C2C2C2", "#C4C4C4", "#C6E2FF", "#C71585",
            "#C7C7C7", "#C9C9C9", "#CAE1FF", "#CAFF70", "#CCCCCC", "#CD0000", "#CD00CD", "#CD1076", "#CD2626",
            "#CD2990", "#CD3278", "#CD3333", "#CD3700", "#CD4F39", "#CD5555", "#CD5B45", "#CD5C5C", "#CD6090",
            "#CD6600", "#CD661D", "#CD6839", "#CD6889", "#CD69C9", "#CD7054", "#CD8162", "#CD8500", "#CD853F",
            "#CD8C95", "#CD919E", "#CD950C", "#CD96CD", "#CD9B1D", "#CD9B9B", "#CDAA7D", "#CDAD00", "#CDAF95",
            "#CDB38B", "#CDB5CD", "#CDB79E", "#CDB7B5", "#CDBA96", "#CDBE70", "#CDC0B0", "#CDC1C5", "#CDC5BF",
            "#CDC673", "#CDC8B1", "#CDC9A5", "#CDC9C9", "#CDCD00", "#CDCDB4", "#CDCDC1", "#CFCFCF", "#D02090",
            "#D15FEE", "#D1D1D1", "#D1EEEE", "#D2691E", "#D2B48C", "#D3D3D3", "#D4D4D4", "#D6D6D6", "#D8BFD8",
            "#D9D9D9", "#DA70D6", "#DAA520", "#DB7093", "#DB7093", "#DBDBDB", "#DCDCDC", "#DDA0DD", "#DEB887",
            "#DEDEDE", "#E066FF", "#E0E0E0", "#E0EEE0", "#E0EEEE", "#E0FFFF", "#E3E3E3", "#E5E5E5", "#E6E6FA",
            "#E8E8E8", "#E9967A", "#EBEBEB", "#EDEDED", "#EE0000", "#EE00EE", "#EE1289", "#EE2C2C", "#EE30A7",
            "#EE3A8C", "#EE3B3B", "#EE4000", "#EE5C42", "#EE6363", "#EE6A50", "#EE6AA7", "#EE7600", "#EE7621",
            "#EE7942", "#EE799F", "#EE7AE9", "#EE8262", "#EE82EE", "#EE9572", "#EE9A00", "#EE9A49", "#EEA2AD",
            "#EEA9B8", "#EEAD0E", "#EEAEEE", "#EEB422", "#EEB4B4", "#EEC591", "#EEC900", "#EECBAD", "#EECFA1",
            "#EED2EE", "#EED5B7", "#EED5D2", "#EED8AE", "#EEDC82", "#EEDD82", "#EEDFCC", "#EEE0E5", "#EEE5DE",
            "#EEE685", "#EEE8AA", "#EEE8CD", "#EEE9BF", "#EEE9E9", "#EEEE00", "#EEEED1", "#EEEEE0", "#F08080",
            "#F0E68C", "#F0F0F0", "#F0F8FF", "#F0FFF0", "#F0FFFF", "#F2F2F2", "#F4A460", "#F5DEB3", "#F5F5DC",
            "#F5F5F5", "#F5FFFA", "#F7F7F7", "#F8F8FF", "#FA8072", "#FAEBD7", "#FAF0E6", "#FAFAD2", "#FAFAFA",
            "#FCFCFC", "#FDF5E6", "#FF0000", "#FF00FF", "#FF1493", "#FF3030", "#FF34B3", "#FF3E96", "#FF4040",
            "#FF4500", "#FF6347", "#FF69B4", "#FF6A6A", "#FF6EB4", "#FF7256", "#FF7F00", "#FF7F24", "#FF7F50",
            "#FF8247", "#FF82AB", "#FF83FA", "#FF8C00", "#FF8C69", "#FFA07A", "#FFA500", "#FFA54F", "#FFAEB9",
            "#FFB5C5", "#FFB6C1", "#FFB90F", "#FFBBFF", "#FFC0CB", "#FFC125", "#FFC1C1", "#FFD39B", "#FFD700",
            "#FFDAB9", "#FFDEAD", "#FFE1FF", "#FFE4B5", "#FFE4C4", "#FFE4E1", "#FFE7BA", "#FFEBCD", "#FFEC8B",
            "#FFEFD5", "#FFEFDB", "#FFF0F5", "#FFF5EE", "#FFF68F", "#FFF8DC", "#FFFACD", "#FFFAF0", "#FFFAFA",
            "#FFFFFF"};

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
        for (int i = 0; i < hex.length(); i++)
            if (!(('0' <= hex.charAt(i) && hex.charAt(i) <= '9') || ('A' <= hex.charAt(i) && hex.charAt(i) <= 'F') || hex.charAt(i) == '#')) {
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

    public String getName() {
        String thisHexColour = toHex();
        int start = 0;
        int end = COLOUR_CODES.length;
        int mid;
        while (start <= end) {
            if (COLOUR_CODES[(mid = start + (end - start) / 2)].compareTo(thisHexColour) == 0) return COLOUR_NAMES[mid];
            if (COLOUR_CODES[mid].compareTo(thisHexColour) > 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return thisHexColour;
    }

    @Override
    public String toString() {
        String colourName = getName();
        return "red= " + red + ", green= " + green + ", blue= " + blue + ", Hex= " + toHex() + (colourName.equals(toHex()) ? "" : colourName);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Colour)) return false;
        Colour other = (Colour) obj;
        return red == other.red && green == other.green && blue == other.blue;
    }
}
