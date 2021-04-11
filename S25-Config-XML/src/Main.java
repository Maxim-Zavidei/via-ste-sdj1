import parser.ParserException;
import parser.XmlJsonParser;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        XmlJsonParser parser = new XmlJsonParser();
        config list = new config();
        list.addFile(new MyFile("gdfsg", "dsgdf", "sdfg"));
        list.addFile(new MyFile("gdfdsdsg", "dsgdf", "sdfg"));

        try {
            File file = parser.toXml(list, "gradelistgg.xml");
            config readParserList = parser.fromXml("config.xml", config.class);
            System.out.println(readParserList.toString());
        } catch (ParserException e) {
            e.printStackTrace();
        }
    }
}
