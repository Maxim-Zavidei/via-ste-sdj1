public class HotelRoom {

    private int number;
    private String type;
    private double price;
    private Guest guest;

    private static final double SINGLE_PRICE = 59.50;
    private static final double DOUBLE_PRICE = 68.50;
    private static final double FAMILY_PRICE = 59.25;

    public static final String SINGLE = "Single";
    public static final String DOUBLE = "Double";
    public static final String FAMILY = "Family";

    public HotelRoom(int number, String type) {
        this.number = number;
        this.type = type;
        this.price = getRoomPrice(type);
        this.guest = null;
    }

    public int getNumber() {
        return this.number;
    }

    public String getType() {
        return this.type;
    }

    public double getPrice() {
        return this.price;
    }

    public Guest getGuest() {
        return this.guest;
    }

    public int getFloor() {
        return number / 100;
    }

    public boolean isOccupied() {
        return guest != null;
    }

    public void registerGuest(Guest guest) {
        this.guest = guest;
    }

    public void vacate() {
        guest = null;
    }

    @Override
    public String toString() {
        String s = number + ", " + type + ", " + price;
        if (isOccupied()) {
            s += ", " + guest;
        } else {
            s += ", Room available";
        }
        return s;
    }

    public static double getRoomPrice(String type) {
        switch (type) {
        case "Single": return SINGLE_PRICE;
        case "Double": return DOUBLE_PRICE;
        case "Family": return FAMILY_PRICE;
        default: return -1;
        }
    }
}
