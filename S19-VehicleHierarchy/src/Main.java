public class Main {
    public static void main(String[] args) {

        Vehicle[] list = new Vehicle[] {
            new Vehicle("lolV", 895.65),
            new Bicycle("lolB", 55.5, 8),
            new Car("lolC", 546, "aaaa"),
            new SportsCar("lolSC", 65, "bbbb", 50),
            new Van("lolV", 98.56, "cccc", 80)
        };

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
            System.out.println(list[i].equals(new Van("lolV", 98.56, "cccc", 80)));
        }
    }
}
