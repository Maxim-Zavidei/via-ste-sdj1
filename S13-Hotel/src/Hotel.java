public class Hotel {

    private String name;
    private HotelRoom[] rooms;

    public Hotel(String name, HotelRoom[] rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfRooms() {
        return rooms.length;
    }

    public int getNumberOfAvailableRooms() {
        int counter = 0;
        for (HotelRoom room : rooms) if (!room.isOccupied()) counter++;
        return counter;
    }

    public int getNumberOfAvailableRooms(String roomType) {
        int counter = 0;
        for (HotelRoom room : rooms) if (!room.isOccupied() && room.getType().equals(roomType)) counter++;
        return counter;
    }

    public HotelRoom getFirstAvailableRoom() {
        for (HotelRoom room : rooms) if (!room.isOccupied()) return room;
        return null;
    }

    public HotelRoom getFirstAvailableRoom(double maxPrice) {
        for (HotelRoom room : rooms) if (!room.isOccupied() && room.getPrice() <= maxPrice) return room;
        return null;
    }

    public HotelRoom[] getAllAvailableRooms(String roomType) {
        int index = 0;
        HotelRoom[] availableRooms = new HotelRoom[getNumberOfAvailableRooms(roomType)];
        for (HotelRoom room : rooms) if (!room.isOccupied() && room.getType().equals(roomType)) availableRooms[index++] = room;
        return availableRooms;
    }

    public boolean hasGuest(Guest guest) {
        for (HotelRoom room : rooms) if (room.getGuest() != null && room.getGuest().equals(guest)) return true;
        return false;
    }

    public HotelRoom getRoom(Guest guest) {
        for (HotelRoom room : rooms) if (room.getGuest() != null && room.getGuest().equals(guest)) return room;
        return null;
    }
}
