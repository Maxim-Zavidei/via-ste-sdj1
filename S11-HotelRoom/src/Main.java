public class Main {
    public static void main(String[] args) {

        HotelRoom hotelRoomObj = new HotelRoom(10, HotelRoom.DOUBLE);
        Guest guestObj = new Guest("lol", 5879525);

        hotelRoomObj.registerGuest(guestObj);
        System.out.println(hotelRoomObj);

        System.out.println("getGuest= " + hotelRoomObj.getGuest());
        System.out.println("isOccupied= " + hotelRoomObj.isOccupied());
        hotelRoomObj.vacate();
        System.out.println(hotelRoomObj);
        System.out.println("getPrice= " + hotelRoomObj.getPrice());
        System.out.println("getType= " + hotelRoomObj.getType());
    }
}
