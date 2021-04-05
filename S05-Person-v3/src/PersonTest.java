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

        Person personObj = new Person(name, age, gender);

        System.out.println();
        System.out.println("getName= " + personObj.getName());
        System.out.println("getAge= " + personObj.getAge());
        System.out.println("getChar= " + personObj.getGender());
        System.out.println("toString= " + personObj.toString());
        System.out.println("getAgeStatus= " + personObj.getAgeStatus());
        System.out.println("getStatus= " + personObj.getStatus());

        input.close();
    }
}
