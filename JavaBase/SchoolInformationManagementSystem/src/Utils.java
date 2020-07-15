import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/11 14:52
 **/
public final class Utils {
    public static void printPerson(Person p) {
        System.out.println("姓名：" + p.getName() + "\n" + "性别：" + p.getSex() + "\n" + "年龄:" + p.getAge() + "\n" + p.getID());
    }

    public static void printArrayList(ArrayList p) {
        System.out.println("学员信息：");
        for (int i = 0; i < p.size(); i++) {
            System.out.println("=================================");
            Person person = (Person) p.get(i);
            printPerson(person);
        }
    }

    public static long birth2days(String brh) throws ParseException {
        String birth = brh;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birth);
        return (new Date().getTime() - date.getTime()) / 1000 / 60 / 60 / 24 / 365;
    }

}
