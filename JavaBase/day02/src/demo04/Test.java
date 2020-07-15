package demo04;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/9 14:26
 **/
public class Test {
    public static void main(String[] args) {
        Animal anl = new Dog();
        anl.eat();
    }
}

class Animal {
    public void eat(){
        System.out.println("吃东西");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }
}

