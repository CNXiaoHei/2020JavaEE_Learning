package demo01;

import javax.sound.midi.Soundbank;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/8 9:37
 **/
public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void eat() {
        super.eat();
        System.out.println("我不吃");
    }

    public void sleep() {
        super.sleep();
        System.out.println("我不睡");
    }

    public void show() {
        this.eat();
        this.sleep();
    }
}
