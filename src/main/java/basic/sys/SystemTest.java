package basic.sys;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author linuxea
 * @date 2018/4/3
 */
public class SystemTest {
	
	public static void main(String[] args) throws IOException {
		System.getProperties().storeToXML(new FileOutputStream(new File("system.xml")), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss 生成").format(new Date()));
	}
	
}
