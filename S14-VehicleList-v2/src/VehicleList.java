import java.util.ArrayList;

public class VehicleList {

    private ArrayList<Car> carList;

    public VehicleList() {
        carList = new ArrayList<>();
    }

    public int size() {
        return carList.size();
    }

    public boolean isFull() {
        return false;
    }

    public void add(Car vehicle) {
        carList.add(vehicle);
    }

    public void remove(Car vehicle) {
        for (int i = 0; i < size(); i++) if (carList.get(i).equals(vehicle)) {
            carList.remove(i);
            return;
        }
    }

    public Car get(int index) {
        return carList.get(index);
    }

    public int getNumberOfCarsByMake(String make) {
        int counter = 0;
        for (Car car : carList) if (car.getMake().equals(make)) counter++;
        return counter;
    }

    public int getNumberOfCarsWithManualGear() {
        int counter = 0;
        for (Car car : carList) if (car.hasManualGear()) counter++;
        return counter;
    }

    public int getNumberOfDieselCars() {
        int counter = 0;
        for (Car car : carList) if (car.getEngine().isDiesel()) counter++;
        return counter;
    }

    public Car[] getCarsByMake(String make) {
        Car[] toReturn = new Car[getNumberOfCarsByMake(make)];
        int counter = 0;
        for (Car car : carList) if (car.getMake().equals(make)) toReturn[counter++] = car;
        return toReturn;
    }

    public Car[] getCarsByGearType(boolean manualGear) {
        Car[] toReturn = new Car[manualGear ? getNumberOfCarsWithManualGear() : size() - getNumberOfCarsWithManualGear()];
        int counter = 0;
        for (Car car : carList) if (car.hasManualGear() == manualGear) toReturn[counter++] = car;
        return toReturn;
    }

    public Car getFirstCarByHorsepower(int minHorsepower) {
        for (Car car : carList) if (car.getEngine().getHorsePower() > minHorsepower) return car;
        return null;
    }
}
