package view;

import model.Cd;
import model.CdModel;
import model.Song;
import java.util.Scanner;

public class CdConsoleView {

    private CdModel model;

    public CdConsoleView(CdModel model) {
        this.model = model;
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("1) Get cd");
            System.out.println("2) Get cds by title");
            System.out.println("3) Get number of cds");
            System.out.println("4) Add cd");
            System.out.println("5) Remove first cd by title");
            System.out.println("6) Clear all cds");
            System.out.println("0) QUIT");

            System.out.print("\nEnter choice: ");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
            case 1:
                System.out.println("Index?: ");
                int index = in.nextInt();
                in.nextLine();
                System.out.println("Cd= " + model.getCd(index));
                break;
            case 2:
                System.out.println("Title?: ");
                String title = in.nextLine();
                System.out.println("Cds by title= " + model.getCdsByTitle(title));
                break;
            case 3:
                System.out.println("Number of cds= " + model.getNumberOfCds());
                break;
            case 4:
                System.out.println("cdTitle?: ");
                String cdTitle = in.nextLine();
                System.out.println("cdArtist?: ");
                String cdArtist = in.nextLine();
                model.addCd(new Cd(cdTitle, cdArtist, new Song[2]));
                System.out.println("Cd added.");
                break;
            case 5:
                System.out.println("cdTitle?: ");
                String removedCdTitle = in.nextLine();
                model.removeFirstCdByTitle(removedCdTitle);
                System.out.println("Cd removed.");
                break;
            case 6:
                model.clear();
                System.out.println("Cd cleared.");
                break;
            case 0:
                running = false;
                break;
            default:
                break;
            }
            System.out.println();
        }
    }
}
