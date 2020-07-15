package damo01;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Method;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/10 9:41
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(A.num);
        B b = new B();
        b.method2();
    }
}

interface A {
    int num = 10;
    void method1(); //抽象方法

    public default void method2() {  //默认方法
        System.out.println("默认方法");
    }

    public static void method3() {
        System.out.println("静态方法");
    }

    private void method() {
        System.out.println("私有方法");
    }
}

class B implements A {

    @Override
    public void method1() {
        System.out.println("实现了抽象方法");
    }

    @Override
    public void method2() {
        System.out.println("重写了默认方法");
    }
}

//class Fu{
//    int a = 10;
//
//    public void show1(){
//        System.out.println("Fu show1...");
//    }
//
//    public static void show2(){
//        System.out.println("Fu show2...");
//    }
//}
//
//class Zi extends Fu{
//    int a = 100;
//
//    public void show1(){
//        System.out.println("Zi show1...");
//    }
//
//    public static void show2(){
//        System.out.println("Zi show2...");
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        /*
//            - 多态时成员变量的访问特点: 编译看父类,运行看父类(编译看左边,运行看左边)
//            - 多态时成员方法的访问特点:
//                非静态方法: 编译看父类,运行看子类(编译看左边,运行看右边)
//                静态方法:   编译看父类,运行看父类(编译看左边,运行看左边)
//
//            记忆:
//                除了非静态方法是编译看父类,运行看子类,其余都是看父类
//                除了非静态方法是编译看左边,运行看右边,其余都是看左边
//         */
//        // 父类的引用指向子类的对象
//        Fu f = new Zi();
//        // f访问变量a
//        System.out.println(f.a);// 10
//        // f访问show1方法
//        f.show1();
//        // f访问show2方法
//        f.show2();
//    }
//}