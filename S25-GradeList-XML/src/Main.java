import parser.ParserException;
import parser.XmlJsonParser;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        GradeList list = new GradeList();
        list.addGrade(new Grade(2, "lol"));
        list.addGrade(new Grade(10, "lol"));
        list.addGrade(new Grade(7, "lolgg"));
        list.addGrade(new Grade(12, "loldd"));
        list.addGrade(new Grade(2, "lolvvf"));

        GradeListXML.gradeListToXML(list);

        GradeList readList = GradeListXML.XMLtoGradeList("gradelistout.xml");
        System.out.println(readList);

        GradeListXML.gradeToXMLDOM(list);

        GradeList readDOMList = GradeListXML.XMLDOMToGrade("gradelistoutdom.xml");
        System.out.println(readDOMList);

        XmlJsonParser parser = new XmlJsonParser();

        try {
            File file = parser.toXml(list, "gradelist.xml");
            GradeList readParserList = parser.fromXml("gradelist.xml", GradeList.class);
            System.out.println(readParserList.toString());
        } catch (ParserException e) {
            // Do nothing.
        }
    }
}
