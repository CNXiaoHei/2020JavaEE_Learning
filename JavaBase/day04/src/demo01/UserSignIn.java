package demo01;

import java.util.Scanner;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/11 10:44
 **/
public class UserSignIn {
    public static void main(String[] args) {
        String userid = "itheima";
        String password = "czbk";

        Scanner sc = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.println("请输入用户名");
            String id = sc.next();
            System.out.println("请输入密码：");
            String psw = sc.next();
            if(id.equalsIgnoreCase(userid)&&psw.equalsIgnoreCase(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i==1) {
                    System.out.println("账号锁定");
                } else {
                    System.out.println("还剩" + (i-1) + "此机会");
                }
            }
        }

    }
}
