package demo04;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/10 18:10
 **/
public class Animal {
    private String name;
    private int age;
    private String sex;

    public Animal(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void eat() {
        System.out.println("吃东西");
    }
}

class Cat extends Animal {
    public Cat(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void catchMouse() {
        System.out.println("抓杰瑞");
    }
}