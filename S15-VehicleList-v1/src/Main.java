public class Main {
    public static void main(String[] args) {

        VehicleList testList = new VehicleList(6);

        testList.add(new Car("lol", "1", "red", true, new Engine("4v", 300, 200, false)));
        testList.add(new Car("lol2", "2", "red", false, new Engine("4v", 500, 200, false)));
        testList.add(new Car("lol", "3", "blue", true, new Engine("4v", 500, 200, true)));
        testList.add(new Car("lol4", "4", "red", true, new Engine("4v", 4000, 200, false)));

        System.out.println("size=" + testList.size());
        System.out.println("get=" + testList.get(2));
        System.out.println("getNumberOfCarsByMake=" + testList.getNumberOfCarsByMake("lol"));
        System.out.println("getNumberOfCarsWithManualGear=" + testList.getNumberOfCarsWithManualGear());
        System.out.println("getCarsByMake=" + testList.getCarsByMake("lol"));
        System.out.println("getFirstCarByHorsepower=" + testList.getFirstCarByHorsepower(400));
    }
}
