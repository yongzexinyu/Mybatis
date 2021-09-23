package ocjp认证;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test36LocalDate的常用方法 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
        System.out.println("dt = " + dt);
        LocalDateTime localDateTime = dt.plusDays(30);//在当前日期后推30天
        System.out.println("localDateTime = " + localDateTime);
        LocalDateTime localDateTime1 = dt.plusMonths(1);////在当前日期后推一个月
        System.out.println("localDateTime1 = " + localDateTime1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));

        LocalDate startlocalDate=LocalDate.of(2021,8,24);
        LocalDate endlocalDate=LocalDate.of(2022,9,18);
        Period period=Period.between(startlocalDate,endlocalDate);
        System.out.println("period = " + period);
    }
/*
* import org.joda.time.DateTime; //导入方法依赖的package包/类
/**
 * 时间加减操作,plus 负数时是向前推移
 */
/*
@Test
public void testTimePlus() {
    // 获取当前时间
    DateTime dt = new DateTime();
    String currentTime = dt.toString("yyyy-MM-dd HH:mm:ss");
    System.out.println("currentTime: " + currentTime);

    // 相对当前时间 向后5天,5天后
    DateTime plus5Days = dt.plusDays(5);
    String plus5DaysStr = plus5Days.toString("yyyy-MM-dd HH:mm:ss");
    System.out.println("plus 5 days: " + plus5DaysStr);

    // 相对当前时间 向后5个小时,5小时后
    DateTime plus5Hours = dt.plusHours(5);
    String plus5HoursStr = plus5Hours.toString("yyyy-MM-dd HH:mm:ss");
    System.out.println("plus 5 hours: " + plus5HoursStr);

    // 相对当前时间,向后5分钟,5分钟后
    DateTime plus5Minutes = dt.plusMinutes(5);
    String plus5MinutesStr = plus5Minutes.toString("yyyy-MM-dd HH:mm:ss");
    System.out.println("plus 5 minutes: " + plus5MinutesStr);

    // 相对当前时间,向前5年,5年前
    DateTime plus5Years = dt.plusYears(-5);
    String plus5YearsStr = plus5Years.toString("yyyy-MM-dd HH:mm:ss");
    System.out.println("5 years ago: " + plus5YearsStr);

    // 相对当前时间,向前5个月
    DateTime plusMonths = dt.plusMonths(-5);
    String plusMonthsStr = plusMonths.toString("yyyy-MM-dd HH:mm:ss");
    System.out.println("5 month ago: " + plusMonthsStr);
}
 */

}
