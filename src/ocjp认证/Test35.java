package ocjp认证;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test35 {
    public static void main(String[] args) {
        String date = LocalDateTime
                .parse("2014-05-04T00:00:00")
                .format(DateTimeFormatter.ISO_DATE_TIME);//日期中没有时分秒 可以为ISO_DATE
        System.out.println(date);
        LocalDateTime parse = LocalDateTime.parse("2014-06-20T00:00:00", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("parse = " + parse);


    }

}
