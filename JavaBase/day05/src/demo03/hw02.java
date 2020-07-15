package demo03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/12 17:14
 **/
public class hw02 {
    public static void main(String[] args) throws ParseException {
//        birth2days();
//        birthCompare();
//        printDate();
        convertFormat();
    }


    // 通过生日计算出生天数
    public static void birth2days() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的生日，请以yyyy-MM-dd格式输入：");
        String birth = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birth);
        if (new Date().getTime() - date.getTime()>0) {
            System.out.println("共计" + ((new Date().getTime() - date.getTime()) / 1000 / 60 / 60 / 24) + "天");
        } else {
            System.out.println("生日必须早于当前日期");
        }
    }

    // 比较两个生日的早晚
    public static void birthCompare() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个生日，请以yyyy-MM-dd格式输入：");
        String birth1 = sc.next();
        System.out.println("请输入第二个生日，请以yyyy-MM-dd格式输入：");
        String birth2 = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(birth1);
        Date date2 = sdf.parse(birth2);
        if (new Date().getTime() - date1.getTime()>0&&new Date().getTime() - date2.getTime()>0) {
            if (date1.getTime() - date2.getTime()>0) {
                System.out.println("第一个生日小于第二个生日");
            }else {
                System.out.println("第一个生日大于第二个生日");
            }
        } else {
            System.out.println("输入的生日必须早于当前日期");
        }
    }

    // 按指定格式打印系统当前时间
    public static void printDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String nowDateStr = sdf.format(date);
        System.out.println(nowDateStr);
    }

    // 转换日期格式 yyyy-MM-dd 到 xxxx年xx月xx日
    public static void convertFormat() throws ParseException {
        System.out.println("请输入一个日期：（格式：yyyy-MM-dd)");
        Scanner sc = new Scanner(System.in);
        String nowDateStr = sc.next();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf1.parse(nowDateStr);
        String newFormatDate = sdf2.format(date);
        System.out.println(newFormatDate);
    }
}

