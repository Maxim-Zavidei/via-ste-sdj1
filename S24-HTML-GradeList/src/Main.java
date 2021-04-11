import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GradeList grades = new GradeList();
        grades.addGrade(new Grade(12, "SDJ1"));
        grades.addGrade(new Grade(-3, "RWD1"));
        grades.addGrade(new Grade(7, "SEP"));
        String[][] placeHolders = new String[][] {
            {"$title", "Grades Page"},
            {"$header", "Grade List Table"},
            {"$paragraph1", "A table containing all of the grades."},
            {"$tableHeader1", "Course"},
            {"$tableHeader2", "Grade"}
        };
        int lastPlaceHolder = 0;
        File inFile = new File("template.html");
        File outFile = new File("grades.html");
        ArrayList<String> output = new ArrayList<>();

        // Read and store from template.
        try (Scanner in = new Scanner(inFile)) {
            eofLoop: while (in.hasNext()) {
                String line = in.nextLine();
                while (lastPlaceHolder < 5) {
                    if (line.contains(placeHolders[lastPlaceHolder][0])) {
                        line = line.replace(placeHolders[lastPlaceHolder][0], placeHolders[lastPlaceHolder++][1]);
                    } else {
                        output.add(line);
                        continue eofLoop;
                    }
                }
                if (line.contains("$tableData1") && line.contains("$tableData2")) {
                    for (int i = 0; i < grades.size(); i++) {
                        output.add("    <tr><td>" + grades.getGrade(i).getCourse() + "</td><td>" + grades.getGrade(i).getGrade() + "</td></tr>");
                    }
                } else {
                    output.add(line);
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Template not found.");
        }

        // Write to new html document.
        try (PrintWriter out = new PrintWriter(outFile)) {
            for (int i = 0; i < output.size(); i++)
                out.println(output.get(i));
            out.close();
        } catch (FileNotFoundException e) {
            // Do nothing.
        }
    }
}
