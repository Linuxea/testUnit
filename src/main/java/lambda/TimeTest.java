package lambda;

import org.junit.Test;
import org.testng.collections.Lists;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.List;

/**
 * create by linuxea on 2017/8/23 14:12
 **/
public class TimeTest {

    @Test
    public void test1(){
        LocalDate start = LocalDate.of(2017,8,1);
        LocalDate end = LocalDate.of(2017,8,10);
        List<LocalDate> localDateList = Lists.newArrayList();
        while (start.isBefore(end)){
            start = start.plusDays(1);
            localDateList.add(start);
        }

        localDateList.forEach(System.out::println);

    }

    @Test
    public void test2(){
        System.out.println(new Date().toString());
        String dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss").format(LocalDateTime.now());
        System.out.println(dateTimeFormatter);
    }

    @Test
    public void test3(){

        LocalDate localDate = LocalDate.of(2017, 8, 23);
        int year = localDate.get(ChronoField.YEAR);
        System.out.println("year:" + year);

        int month = localDate.get(ChronoField.MONTH_OF_YEAR);
        System.out.println("month:" + month);

        int days = localDate.get(ChronoField.DAY_OF_MONTH);
        System.out.println("month:" + days);

        System.out.println(localDate.getMonth()); //english
        System.out.println(localDate.getMonthValue()); // 阿拉伯数字

        System.out.println(localDate.getDayOfWeek()); //WEDNESDAY
        System.out.println(localDate.getDayOfWeek().getValue());

    }


    @Test
    public void test4(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getSecond());

        System.out.println(localDateTime.getNano());

        System.out.println(localDateTime.getMinute());

        System.out.println(LocalDateTime.now().equals(LocalDateTime.now()));

        System.out.println(LocalDate.parse("2017-05-21"));

        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy ss/mm/hh").format(LocalDateTime.now()));
    }

}
