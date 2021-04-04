import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Name= ");
        String name = input.nextLine();

        System.out.print("Age= ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Gender= ");
        String line = input.nextLine();
        char gender = line.charAt(0);

        Person firstPersonObj = new Person(name, age, gender);

        System.out.println();
        System.out.println("Original first person data:");
        System.out.println("getName= " + firstPersonObj.getName());
        System.out.println("getAge= " + firstPersonObj.getAge());
        System.out.println("getChar= " + firstPersonObj.getGender());
        System.out.println("toString: " + firstPersonObj.toString());

        firstPersonObj.setName("Bobby");
        firstPersonObj.setAge(25);
        firstPersonObj.setGender('M');

        System.out.println();
        System.out.println("Changed first person data:");
        System.out.println("getName= " + firstPersonObj.getName());
        System.out.println("getAge= " + firstPersonObj.getAge());
        System.out.println("getGender= " + firstPersonObj.getGender());

        Person secondPersonObj = new Person("Mary", 'F');

        System.out.println();
        System.out.println("Original second person data:");
        System.out.println("toString: " + secondPersonObj.toString());

        secondPersonObj.setName("Lucy");
        secondPersonObj.setAge(22);
        secondPersonObj.setGender('F');

        System.out.println();
        System.out.println("Changed second person data:");
        System.out.println("getName= " + secondPersonObj.getName());
        System.out.println("getAge= " + secondPersonObj.getAge());
        System.out.println("getGender= " + secondPersonObj.getGender());

        Person thirdPersonObj = new Person('M');

        System.out.println();
        System.out.println("Original third person data:");
        System.out.println("toString: " + thirdPersonObj.toString());

        thirdPersonObj.setName("Steve");
        thirdPersonObj.setAge(25);
        thirdPersonObj.setGender('M');

        System.out.println();
        System.out.println("Changed third person data:");
        System.out.println("getName= " + thirdPersonObj.getName());
        System.out.println("getAge= " + thirdPersonObj.getAge());
        System.out.println("getGender= " + thirdPersonObj.getGender());

        input.close();
    }
}
