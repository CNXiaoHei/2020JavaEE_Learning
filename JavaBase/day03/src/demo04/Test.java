package demo04;

import demo03.Car;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/10 18:09
 **/
public class Test {
    public static void main(String[] args) {
        Cat a = new Cat("Tom",5,"公");
        Animal b = new Cat("Jack",3,"母");
        a.eat();
        a.catchMouse();
        b.eat();
        Cat c = (Cat) b;
        c.catchMouse();
    }
}
