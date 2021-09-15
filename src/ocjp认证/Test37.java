package ocjp认证;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test37 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 6, 20);
        LocalDateTime date3 = LocalDateTime.parse("2014-06-20T10:25:31", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);


        // 获取当前的日期
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("currentTime = " + currentTime);
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        //时间转换
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("formatter = " + formatter);

        // 获取当前的日期时间
        LocalDateTime currentTime1 = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("currentTime1 = " + currentTime1);
        System.out.println("当前时间转换"+ currentTime1 .format(formatter1));


    }


}
