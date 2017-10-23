package xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;

/**
 * Created by Linuxea on 10/23/17.
 */
public class ParseXml {

    public static void parse() throws DocumentException {

        String filePath = "/home/linuxea/Desktop/demo.xml";

        SAXReader reader = new SAXReader();
        Document document = reader.read(new File(filePath));

        Element root = document.getRootElement();

        for (Iterator<Element> iterator = root.elementIterator(); iterator.hasNext(); ) {
            // print attribute
            Element element = iterator.next();
            System.out.print(element.getName() + "\t");

            for (Iterator<Attribute> attributeIterator = element.attributeIterator(); attributeIterator.hasNext(); ) {
                // print attribute
                Attribute attribute = attributeIterator.next();
                System.out.print(attribute.getName() + ":" + attribute.getValue() + "\t");
            }

            System.out.println();

        }


    }


    public static void main(String[] args) {
        try {
            ParseXml.parse();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

}
