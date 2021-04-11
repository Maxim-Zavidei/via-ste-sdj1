package mediator;

import model.Grade;
import model.GradeList;

public interface GradeListPersistence {
    GradeList load(String fileName);
    void save(String fileName, GradeList toStore);
}
