public class Main {
    public static void main(String[] args) {

        MyDateTime firstTestObj = new MyDateTime(28, 10, 1997, 14, 8, 5);
        MyDateTime secondTestObj = new MyDateTime(2, 1, 2020);

        System.out.println(firstTestObj.equals(secondTestObj));
        System.out.println(firstTestObj.getDate());
        System.out.println(firstTestObj.getTime());
        System.out.println(firstTestObj);
        System.out.println(secondTestObj);
        System.out.println(firstTestObj);
        System.out.println(firstTestObj.toString("Bobs birthday is %DD-%MM-%YY"));
    }
}
