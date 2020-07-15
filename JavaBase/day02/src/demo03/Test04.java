package demo03;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/9 10:47
 **/
public class Test04 {
    public static void main(String[] args) {
        One o = new One();
        Two t = new Two();
        t.a = 5;
        System.out.println(o.a);
        System.out.println(t.a);
    }
}

class One{
    static int a = 10;
}

class Two extends One{
    //static int a = 20;
}
