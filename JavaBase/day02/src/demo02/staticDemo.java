package demo02;

import javax.naming.Name;
import javax.sound.midi.Soundbank;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/8 16:03
 **/
public class staticDemo {
    static String name;
    static String country;

    public static void call() {
        name = "zbc";
        country = "CN";
    }

    static {  //一般用于加载驱动
        System.out.println("静态代码块");//优先于构造方法执行
    }

}
