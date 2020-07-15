package demo01;

public class Student {
    //成员变量 姓名，年龄
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    /**
     * 学习功能
     */
    public void learn() {
        System.out.println("学习ing");
    }

    public void homework() {
        System.out.println("做作业ing");
    }
}
