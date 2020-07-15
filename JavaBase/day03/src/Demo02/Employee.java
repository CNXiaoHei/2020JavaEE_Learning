package Demo02;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/10 17:03
 **/
public abstract class Employee {
    private String name; //姓名
    private String sex;  //性别
    private int age;     //年龄

    public Employee() {
    }

    public Employee(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract void work();
}
