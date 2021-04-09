public class Garage {

    private Car carAtPosition0;
    private Car carAtPosition1;

    public Garage() {
        carAtPosition0 = null;
        carAtPosition1 = null;
    }

    public boolean isParkingAreaTaken(int position) {
        return null != (position == 0 ? carAtPosition0 : carAtPosition1);
    }

    public void park(Car car, int position) {
        if (!isParkingAreaTaken(position)) {
            switch (position) {
                case 0: carAtPosition0 = car; break;
                case 1: carAtPosition1 = car; break;
            }
        }
    }

    public Car takeACarRide(int position) {
        if (!isParkingAreaTaken(position)) return null;
        Car toReturn = null;
        switch (position) {
        case 0:
            toReturn = carAtPosition0;
            carAtPosition0 = null;
            break;
        case 1:
            toReturn = carAtPosition1;
            carAtPosition1 = null;
        }
        return toReturn;
    }

    @Override
    public String toString() {
        return "carAtPosition0=" + carAtPosition0 + ", carAtPosition1=" + carAtPosition1;
    }
}
