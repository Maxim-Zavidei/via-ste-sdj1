public class Main {
    public static void main(String[] args) {

        HotelRoom[] testRooms = new HotelRoom[] {
            new HotelRoom(1, HotelRoom.SINGLE),
            new HotelRoom(2, HotelRoom.DOUBLE), new HotelRoom(3, HotelRoom.FAMILY),
            new HotelRoom(4, HotelRoom.SINGLE)
        };

        testRooms[0].registerGuest(new Guest("lol", 0));
        testRooms[2].registerGuest(new Guest("lol2", 1));

        Hotel hotelObj = new Hotel("test", testRooms);

        System.out.println("getFirstAvailableRoom=" + hotelObj.getFirstAvailableRoom());
        System.out.println("getNumberOfAvailableRooms=" + hotelObj.getNumberOfAvailableRooms());
        System.out.println("hasGuest=" + hotelObj.hasGuest(new Guest("lol2", 1)));
        System.out.println("getRoom=" + hotelObj.getRoom(new Guest("lol", 0)));
        System.out.println("getAvailableRooms=" + hotelObj.getAllAvailableRooms("Single"));
        System.out.println("getFirstAvailableRoom=" + hotelObj.getFirstAvailableRoom(68));
    }
}
