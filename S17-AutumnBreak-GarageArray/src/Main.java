public class Main {
    public static void main(String[] args) {

        Garage garageObj = new Garage(5);

        System.out.println("isParkingAreaTaken0= " + garageObj.isParkingAreaTaken(0));
        System.out.println("isParkingAreaTaken1= " + garageObj.isParkingAreaTaken(1));

        garageObj.park(new Car("bred", "bred", "red", true, new Engine("aa", 45, 200, true)), 0);
        garageObj.park(new Car("bred", "bred", "red", true, new Engine("aa", 45, 200, true)), 0);
        garageObj.park(new Car("lol", "bred", "red", true, new Engine("aa", 45, 200, true)), 1);

        System.out.println(garageObj);
        garageObj.takeACarRide(0);
        System.out.println(garageObj.isParkingAreaTaken(0));
    }
}
