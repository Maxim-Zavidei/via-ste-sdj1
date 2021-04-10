public class Main {
    public static void main(String[] args) {

        Person person = new Person("lol");

        person.learnATopic("topic1");
        person.learnATopic("topic2");
        person.learnATopic("topic3");

        System.out.println(person.getIQ());
        System.out.println(person.doYouRememberThis("topic1"));
        System.out.println(person.presentTopic(2));
        System.out.println(person);
    }
}
