package damo01;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/10 19:37
 **/
public interface InterfaceExample {
    /*
        - 常量(jdk7及其以前)
        - 抽象方法(jdk7及其以前)
        - 默认方法(jdk8)
        - 静态方法(jdk8)
        - 私有方法(jdk9)
     */
    int num = 10;

    //void method1();

    public default void method2() {
        System.out.println("接口中的默认方法");
    }

    public static void method3() {
        System.out.println("接口中的静态方法");
    }

    private void  method4() {
        System.out.println("接口中的私有方法");
    }

    private static void method5() {
        System.out.println("接口中的私有静态方法");
    }


}
