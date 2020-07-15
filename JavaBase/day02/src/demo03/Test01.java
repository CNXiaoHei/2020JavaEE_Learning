package demo03;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/8 17:54
 **/
class Person {
    private String name;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void eat() {
        System.out.println("吃东西");
    }

    public void sleep() {
        System.out.println("睡觉");
    }
}

class Student extends Person {
    public Student() {
    }

    public Student(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void study() {
        System.out.println(super.getName() + "在学java");
    }
}

class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void teach() {
        System.out.println(super.getName() + "教java");
    }
}

public class Test01 {
    public static void main(String[] args) {
        Student stu = new Student("张三",18,"男");
        Teacher thr = new Teacher("李四",25,"女");
        stu.study();
        thr.teach();
    }
}
