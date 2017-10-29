package xml;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Linuxea on 10/23/17.
 */
public class CreateXml {

    public static void create() throws IOException {

        String filePath = "/home/linuxea/Desktop/demo.xml";

        Writer newFileWriter = new FileWriter(filePath);

        Document document = DocumentHelper.createDocument();
        Element root = document.addElement("students");

        root.addElement("Linuxea").addAttribute("sex", "boy").addAttribute("age", "12");
        root.addElement("fenny").addAttribute("sex", "girl").addAttribute("age", "17");
        root.addElement("pony").addAttribute("sex", "boy").addAttribute("age", "19");
        root.addElement("jackMa").addAttribute("sex", "boy").addAttribute("age", "21");

        XMLWriter writer = new XMLWriter(newFileWriter);
        writer.write(document);
        writer.close();
    }


    public static void main(String[] args) {
//        try {
//            CreateXml.create();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}
