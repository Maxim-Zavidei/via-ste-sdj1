import model.Grade;
import model.GradeList;
import mediator.GradeListPersistence;
import mediator.ReadWriteToTXT;
import mediator.ReadWriteToBin;

public class Main {
    public static void main(String[] args) {

        GradeListPersistence txtMediator = new ReadWriteToTXT();
        GradeListPersistence binMediator = new ReadWriteToBin();

        System.out.println(txtMediator.load("gradesIn.txt"));
        binMediator.save("gradesOut.bin", txtMediator.load("gradesIn.txt"));
        System.out.println(binMediator.load("gradesOut.bin"));
    }
}
