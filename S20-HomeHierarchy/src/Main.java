public class Main {
    public static void main(String[] args) {

        Person[] people = new Person[] {
            new Person("lol0", new Apartment("ll3", 56)),
            new Person("lol1", new House("ll1", 56)),
            new Person("lol2", new House("ll2", 56)),
            new Person("lol0", new Apartment("ll3", 56))
        };

        for (Person person : people) {
            System.out.println(person);
            System.out.println(person.equals(people[3]));
        }
    }
}
