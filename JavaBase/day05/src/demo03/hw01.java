package demo03;

import java.util.Objects;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/12 17:02
 **/
public class hw01 {
    public static void main(String[] args) {
        // 测试手机类的toString方法重写
        Phone p1 = new Phone("Apple","black",8388.0);
        Phone p2 = new Phone("Samsung","black",8388.0);
        System.out.println(p1);
        System.out.println(p2);

        // 测试学生类的equals方法重写
        Student stu1 = new Student("张三","男", 18);
        Student stu2 = new Student("张三","男", 18);
        Student stu3 = new Student("李四","男", 18);
        System.out.println(stu1.equals(stu2));
        System.out.println(stu1.equals(stu3));
    }
}

class Phone {
    private String brand;
    private String color;
    private double price;

    public Phone() {
    }

    public Phone(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

class Student {
    private String name;
    private String sex;
    private int age;

    public Student() {
    }

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age);
    }
}