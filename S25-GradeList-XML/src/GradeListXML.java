import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeListXML {

    public static void gradeListToXML(GradeList list) {
        try (PrintWriter out = new PrintWriter(new File("gradelistout.xml"))) {

            out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
            out.println("<gradelist>");
            for (int i = 0; i < list.size(); i++) {
                out.println("   <grade>");
                out.println("      <points>" + list.getGrade(i).getGrade() + "</points>");
                out.println("      <course>" + list.getGrade(i).getCourse() + "</course>");
                out.println("   </grade>");
            }
            out.println("</gradelist>");
            out.close();
        } catch (FileNotFoundException e) {
            // Do nothing.
        }
    }

    public static GradeList XMLtoGradeList(String fileName) {
        try (Scanner in = new Scanner(new File(fileName))) {
            GradeList toReturn = new GradeList();
            int grade = 0;
            String course = "";
            while (in.hasNext()) {
                String line = in.nextLine();
                if (line.contains("<points>")) {
                    line = line.replace("<points>", "");
                    line = line.replace("</points>", "");
                    grade = Integer.parseInt(line.trim());
                } else if (line.contains("<course>")) {
                    line = line.replace("<course>", "");
                    line = line.replace("</course>", "");
                    course = line.trim();
                } else if (line.contains("</grade>")) {
                    toReturn.addGrade(new Grade(grade, course));
                    grade = 0;
                    course = "";
                }
            }
            return toReturn;
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    public static void gradeToXMLDOM(GradeList list) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element rootElement = doc.createElement("gradelist");

            for (int i = 0; i < list.size(); i++) {
                Element subElement = doc.createElement("grade");

                Element subSubElement = doc.createElement("points");
                subSubElement.appendChild(doc.createTextNode(((Integer) list.getGrade(i).getGrade()).toString()));
                subElement.appendChild(subSubElement);

                subSubElement = doc.createElement("course");
                subSubElement.appendChild(doc.createTextNode(list.getGrade(i).getCourse()));
                subElement.appendChild(subSubElement);

                rootElement.appendChild(subElement);
            }
            doc.appendChild(rootElement);
            try {
                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                File file = new File("gradelistoutdom.xml");
                try {
                    transformer.transform(new DOMSource(doc), new StreamResult(file));
                } catch (TransformerException e) {
                    // Do nothing.
                }
            } catch (TransformerConfigurationException e) {
                // Do nothing.
            }
        } catch (ParserConfigurationException e) {
            // Do nothing.
        }
    }

    public static GradeList XMLDOMToGrade(String fileName) {
        GradeList toReturn = new GradeList();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            try {
                Document doc = builder.parse(fileName);
                try {
                    Transformer transformer = TransformerFactory.newInstance().newTransformer();
                    transformer.setOutputProperty(OutputKeys.INDENT, "no");
                    int grade = 0;
                    String course = "";

                    NodeList rootList = doc.getElementsByTagName("grade");
                    for (int index = 0; index < rootList.getLength(); index++) {
                        Node rootNode = rootList.item(index);
                        NodeList subNodes = rootNode.getChildNodes();
                        for (int i = 0; i < subNodes.getLength(); i++) {
                            if (subNodes.item(i).getNodeName().equals("points")) {
                                grade = Integer.parseInt(subNodes.item(i).getTextContent());
                            } else if (subNodes.item(i).getNodeName().equals("course")) {
                                course = subNodes.item(i).getTextContent();
                            }
                        }
                        toReturn.addGrade(new Grade(grade, course));
                    }
                } catch (TransformerConfigurationException e) {
                    // Do nothing.
                }
            } catch (SAXException | IOException e) {
                // Do nothing.
            }
        } catch (ParserConfigurationException e) {
            // Do nothing.
        }
        return toReturn;
    }
}
