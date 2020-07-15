package demo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/12 19:09
 **/
public class hw03 {
    public static void main(String[] args) throws ParseException {
//        printCalendar();
        calculateDate("1994年01月03日");
    }

    // 获取年、月、日、小时、分、秒，并将它们打印到控制台
    public static void printCalendar() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        System.out.println(year + "年" + month + "月" + day + "日" + hour + "时" + minute + "分" + second + "秒");

    }

    // 计算并打印“1949年10月1日”那天是星期几？
    public static void calculateDate(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date passDate = sdf.parse(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(passDate);
        int dayofWeek = cal.get(Calendar.DAY_OF_WEEK);
        String[] week = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六",};
        if (dayofWeek>0&&dayofWeek<8) {
            System.out.println(date + week[dayofWeek-1]);
        } else {
            throw new RuntimeException("输入数字错误！");
        }


    }
}
