import java.text.ParseException;
import java.util.Date;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/10 20:44
 **/
public class Person {
    private int ID;
    private String name;
    private int age;
    private String sex;
    private String birth;

    public Person(int ID, String name, int age, String sex, String birth) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birth = birth;
    }

    public Person() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public void setAge(String birth) throws ParseException {
        age = (int) Utils.birth2days(birth);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
