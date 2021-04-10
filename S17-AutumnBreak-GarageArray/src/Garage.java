public class Garage {

    private Car[] garage;

    public Garage(int capacity) {
        garage = new Car[capacity];
    }

    public boolean isParkingAreaTaken(int position) {
        return null != garage[position];
    }

    public void park(Car car, int position) {
        for (Car carObj : garage) if (carObj != null && carObj.equals(car)) return;
        if (!isParkingAreaTaken(position)) garage[position] = car;
    }

    public Car takeACarRide(int position) {
        if (!isParkingAreaTaken(position)) return null;
        Car toReturn = garage[position];
        for (int i = position; i < garage.length - 1; i++) garage[i] = garage[i + 1];
        return toReturn;
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder();
        for (int i = 0; i < garage.length; i++) if (garage[i] != null) toReturn.append(garage[i]).append(", ");
        return toReturn.toString();
    }
}
