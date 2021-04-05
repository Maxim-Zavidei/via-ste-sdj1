public class PersonTest {
    public static void main(String[] args) {

        Person personObj = new Person("Bob");
        System.out.println(personObj);

        personObj.addChild();
        personObj.addChild();
        personObj.setMaritalStatus("married");
        System.out.println(personObj);
        System.out.println("isSingle= " + personObj.isSingle());
    }
}
