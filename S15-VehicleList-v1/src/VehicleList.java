public class VehicleList {

    private int size;
    private Car[] carList;

    public VehicleList(int maxSize) {
        this.size = 0;
        carList = new Car[maxSize];
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return size == carList.length;
    }

    public void add(Car vehicle) {
        if (isFull()) return;
        carList[size++] = vehicle;
    }

    public void remove(Car vehicle) {
        for (int i = 0; i < size(); i++) if (carList[i].equals(vehicle)) {
            for (int j = i; j < this.size - 1; j++) {
                carList[j] = carList[j + 1];
            }
            carList[size - 1] = null;
            break;
        }
    }

    public Car get(int index) {
        return carList[index];
    }

    public int getNumberOfCarsByMake(String make) {
        int counter = 0;
        for (Car car : carList) if (car != null && car.getMake().equals(make)) counter++;
        return counter;
    }

    public int getNumberOfCarsWithManualGear() {
        int counter = 0;
        for (Car car : carList) if (car != null && car.hasManualGear()) counter++;
        return counter;
    }

    public int getNumberOfDieselCars() {
        int counter = 0;
        for (Car car : carList) if (car != null && car.getEngine().isDiesel()) counter++;
        return counter;
    }

    public Car[] getCarsByMake(String make) {
        Car[] toReturn = new Car[getNumberOfCarsByMake(make)];
        int counter = 0;
        for (Car car : carList) if (car != null && car.getMake().equals(make)) toReturn[counter++] = car;
        return toReturn;
    }

    public Car[] getCarsByGearType(boolean manualGear) {
        Car[] toReturn = new Car[manualGear ? getNumberOfCarsWithManualGear() : size() - getNumberOfCarsWithManualGear()];
        int counter = 0;
        for (Car car : carList) if (car != null && car.hasManualGear() == manualGear) toReturn[counter++] = car;
        return toReturn;
    }

    public Car getFirstCarByHorsepower(int minHorsepower) {
        for (Car car : carList) if (car != null && car.getEngine().getHorsePower() > minHorsepower) return car;
        return null;
    }
}
