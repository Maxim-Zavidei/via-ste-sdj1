import java.util.Scanner;

public class EngineTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String type;
        int horsePower;
        int volume;
        boolean isDiesel;
        int answer;

        System.out.println("Testing the first engine constructor type:");
        System.out.print("Enter the engine type= ");
        type = input.nextLine();
        System.out.print("Enter the engine horse power= ");
        horsePower = input.nextInt();
        System.out.print("Enter the engine volume= ");
        volume = input.nextInt();

        System.out.print("Press 1 if the engine is diesel and 0 if not: ");
        answer = input.nextInt();
        input.nextLine();
        isDiesel = answer == 1;

        Engine firstEngineObj = new Engine(type, horsePower, volume, isDiesel);

        System.out.println();
        System.out.println("getType= " + firstEngineObj.getType());
        System.out.println("getHorsePower= " + firstEngineObj.getHorsePower());
        System.out.println("getVolume= " + firstEngineObj.getVolume());
        System.out.println("isDiesel= " + firstEngineObj.isDiesel());
        System.out.println("toString: " + firstEngineObj.toString());
        System.out.println();

        System.out.println("Testing the second engine constructor type:");
        System.out.print("Enter the engine type= ");
        type = input.nextLine();
        System.out.print("Enter the engine horse power= ");
        horsePower = input.nextInt();
        System.out.print("Enter the engine volume= ");
        volume = input.nextInt();

        Engine secondEngineObj = new Engine(type, horsePower, volume);

        System.out.println();
        System.out.println("getType= " + secondEngineObj.getType());
        System.out.println("getHorsePower= " + secondEngineObj.getHorsePower());
        System.out.println("getVolume= " + secondEngineObj.getVolume());
        System.out.println("isDiesel= " + secondEngineObj.isDiesel());
        System.out.println("toString: " + secondEngineObj.toString());
        System.out.println();

        input.close();
    }
}
