package demo03;

import java.util.Scanner;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/12 23:22
 **/
public class hw08 {
    public static void main(String[] args) {
//        gradePlus();
        convertDatatype();
    }

    /*
       从控制台接收一个整数的“分数”值，
       要求用String类型的变量存储，
       程序可以将这个String类型的分数值转换为int值，
       并将分数 + 5分后打印到控制台。
     */
    public static void gradePlus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个分数值：");
        String grade = sc.next();
        Integer gradeInt = Integer.valueOf(grade);
        gradeInt += 5;
        System.out.println(gradeInt);
    }

    public static void convertDatatype() {
        StudentMan stu = new StudentMan();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.next();
        stu.setName(name);
        System.out.println("请输入年龄：");
        String age = sc.next();
        stu.setAge(Integer.parseInt(age));
        System.out.println("请输入身高：");
        String high = sc.next();
        stu.setHigh(Double.parseDouble(high));
        System.out.println("是否结婚?\ntrue or false");
        String marry = sc.next();
        stu.setMarried(Boolean.parseBoolean(marry));
        System.out.println("请输入性别：");
        String sex = sc.next();
        stu.setSex(sex.charAt(0));
        System.out.println(stu);
    }
}

class StudentMan{
    private String name;
    private int age;
    private double high;
    private boolean isMarried;
    private char sex;

    public StudentMan() {
    }

    public StudentMan(String name, int age, double high, boolean isMarried, char sex) {
        this.name = name;
        this.age = age;
        this.high = high;
        this.isMarried = isMarried;
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

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "StudentMan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", high=" + high +
                ", isMarried=" + isMarried +
                ", sex=" + sex +
                '}';
    }
}
