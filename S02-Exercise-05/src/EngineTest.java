import java.util.Scanner;
import rentalcompany.model.*;

public class EngineTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the engine type= ");
        String type = input.nextLine();

        System.out.print("Enter the horse power of the engine= ");
        int horsePower = input.nextInt();

        System.out.print("Enter the volume of the engine= ");
        int volume = input.nextInt();

        Engine engineObj = new Engine(type, horsePower, volume, false);

        System.out.println("Engine information: " + engineObj.toString());

        input.close();
    }
}
