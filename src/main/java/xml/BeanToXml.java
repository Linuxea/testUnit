package xml;

import com.thoughtworks.xstream.XStream;

import java.util.Arrays;
import java.util.List;

public class BeanToXml {
	
	public static void toXml() {
		XStream xStream = new XStream();
		Model model1 = new Model(1, "linuxea");
		Model model2 = new Model(2, "pony");
		Model model3 = new Model(3, "boonie");
		List<Model> modelList = Arrays.asList(model1, model2, model3);
		String string = xStream.toXML(modelList);
		System.out.println(string);
	}
	
	public static void main(String[] args) {
		BeanToXml.toXml();
	}
	
}
