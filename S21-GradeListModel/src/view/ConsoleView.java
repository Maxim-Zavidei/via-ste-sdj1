package view;

import model.GradeList;
import model.GradeListModel;
import java.util.Scanner;

public class ConsoleView {

    GradeListModel model;

    public ConsoleView(GradeListModel model) {
        this.model = model;
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("1) Get number of grades");
            System.out.println("2) Add grade");
            System.out.println("3) Remove grade");
            System.out.println("4) Get grade");
            System.out.println("5) Get max grade");
            System.out.println("6) Get min grade");
            System.out.println("7) Get average");
            System.out.println("8) Get all");
            System.out.println("0) QUIT");

            System.out.print("\nEnter choice: ");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
            case 1:
                System.out.println("Number of grades= " + model.numberOfGrades());
                break;
            case 2:
                System.out.println("Grade?: ");
                int grade = in.nextInt();
                model.addGrade(grade, "test");
                break;
            case 3:
                System.out.println("Index?: ");
                int index = in.nextInt();
                in.nextLine();
                model.removeGrade(index);
                System.out.println("Grade removed");
                break;
            case 4:
                System.out.println("Index?: ");
                int indexGrade = in.nextInt();
                in.nextLine();
                System.out.println("Grade= " + model.getGrade(indexGrade));
                break;
            case 5:
                System.out.println("Max grade= " + model.getMaxGrade());
                break;
            case 6:
                System.out.println("Min grade= " + model.getMinGrade());
                break;
            case 7:
                System.out.println("Average grade= " + model.getAverage());
                break;
            case 8:
                System.out.println("Get all= " + model.getAll());
                break;
            case 0:
                running = false;
                break;
            default:
                break;
            }
        }
        System.out.println();
    }
}
