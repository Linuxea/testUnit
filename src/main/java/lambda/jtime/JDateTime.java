package lambda.jtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JDateTime {
	
	public static void init() {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		String meDate = "2017-10-30";
		DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate parseDate = LocalDate.parse(meDate, dateFormater);
		System.out.println(parseDate);
		
		String meDateTime = "2017-10-30 01:31:26";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime parseDateTime = LocalDateTime.parse(meDateTime, dateTimeFormatter);
		System.out.println(parseDateTime);
	}
	
	public static void main(String[] args) {
		JDateTime.init();
	}
	
}
