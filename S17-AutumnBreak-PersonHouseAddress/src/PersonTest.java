public class PersonTest {
    public static void main(String[] args) {

        Person firstPer = new Person("bob");
        firstPer.moveTo(new House(new Address("lol", "testtown"), 5.5));
        Person secondPer = new Person("bobby");
        secondPer.moveTo(new House(new Address("lol", "hhtown"), 4.2));

        System.out.println(firstPer.getTown());
        System.out.println(secondPer.getTown());
        System.out.println(firstPer.getAddress().equals(secondPer.getAddress()));
    }
}
