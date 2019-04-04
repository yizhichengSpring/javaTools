package com.jtools.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author yi
 * @ClassName DateTools
 * @Description TODO
 * @Date
 **/
public class DateTools {

    /**
     * 这里我尽量选择最新的Java8里的
     * LocalDate、LocalTime、LocalDateTime去做
     */


    /**
     * 返回今天
     * @return
     */
    public static String getToday() {
        return LocalDate.now().toString();
    }

    /**
     *
     */
    public static String systemTime() {
        return LocalDateTime.now(ZoneId.of("Asia/Chongqing")).toString();
    }

    /**
     * 两个日期之间差的天数
     * 可以是字符串格式 2019-04-03
     * 可以是 Date类
     * 可以是 时间戳 毫秒为单位
     */


    /**
     * 某个日期到今天的天数差
     */


    /**
     * 转成yyyy-mm-dd
     * 转成 yyyy-mm-dd hh:mm:ss
     */


    /**
     * 日期转时间戳
     * 可以是字符串 也可以是 Date
     */

}
