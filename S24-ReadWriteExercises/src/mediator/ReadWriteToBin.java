package mediator;

import java.io.*;
import model.Grade;
import model.GradeList;

public class ReadWriteToBin implements GradeListPersistence {

    @Override
    public GradeList load(String fileName) {
        ObjectInputStream in = null;
        GradeList listToReturn = new GradeList();
        File inFile = new File(fileName);
        try (FileInputStream fis = new FileInputStream(inFile)) {
            in = new ObjectInputStream(fis);
            listToReturn = (GradeList) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Do nothing.
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                // Do nothing.
            }
        }
        return listToReturn;
    }

    @Override
    public void save(String fileName, GradeList list) {
        ObjectOutputStream out = null;
        File outFile = new File(fileName);
        try (FileOutputStream fos = new FileOutputStream(outFile)) {
            out = new ObjectOutputStream(fos);
            out.writeObject(list);
        } catch (IOException e) {
            // Do nothing.
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                // Do nothing.
            }
        }
    }
}
