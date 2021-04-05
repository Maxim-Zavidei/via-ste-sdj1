public class Main {
    public static void main(String[] args) {

        Clock clockObj = new Clock(10, 10, 10);
        MyDate myDateObj = new MyDate(3, 10, 2020);

        Clock newClockObj = clockObj.copy();
        MyDate newMyDateObj = myDateObj.copy();

        System.out.println(newClockObj);
        System.out.println(newMyDateObj);
    }
}
