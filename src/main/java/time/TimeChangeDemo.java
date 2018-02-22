package time;

import org.apache.commons.lang3.time.DateUtils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author linuxea
 * @date 2018/2/2
 */
public class TimeChangeDemo {
	
	public static void main(String[] args) throws Exception {
		File fileToChange = new File("C:\\Users\\Linux\\Desktop\\haha2");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		File[] files = fileToChange.listFiles();
		for (File file : files) {
			String name = file.getName();
			Date parse = simpleDateFormat.parse(name);
			Date date = DateUtils.addDays(parse, 1);
			Date date1 = DateUtils.addHours(date, 3);
			Date date2 = DateUtils.addMinutes(date1, 30);
			file.setLastModified(date2.getTime());
		}
	}
	
}
