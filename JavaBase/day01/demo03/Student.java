package demo03;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/7 20:24
 **/
public class Student extends Person {
    private int id;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void study() {
        System.out.println("学习中");
    }
}
