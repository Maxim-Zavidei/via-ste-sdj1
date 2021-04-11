package mediator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import model.Grade;
import model.GradeList;

public class ReadWriteToTXT implements GradeListPersistence {

    @Override
    public GradeList load(String fileName) {
        File inFile = new File(fileName);
        GradeList listToReturn = new GradeList();
        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNext()) {
                String line = in.nextLine();
                String[] token = line.split(";");
                String course = token[0].trim();
                int grade = Integer.parseInt(token[1].trim());
                listToReturn.addGrade(new Grade(grade, course));
            }
            in.close();
            return listToReturn;
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    @Override
    public void save(String fileName, GradeList list) {
        File outFile = new File(fileName);
        try (PrintWriter out = new PrintWriter(outFile)) {
            for (int i = 0; i < list.size(); i++) {
                out.println(list.getGrade(i).getGrade() + "; " + list.getGrade(i).getCourse());
            }
            out.close();
        } catch (FileNotFoundException e) {
            // Do nothing.
        }
    }
}
