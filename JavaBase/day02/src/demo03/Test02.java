package demo03;

import javax.sound.midi.Soundbank;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/8 18:09
 **/
public class Test02 {
    public static void main(String[] args) {
        OldZhang oZ = new OldZhang("老张","男",40,"汤臣一品");
        LittleZhang lZ = new LittleZhang("小张","男",18,"汤臣一品");
        oZ.makeMoney();
        lZ.makeMoney();
    }
}

class OldZhang {
    private String name;
    private String sex;
    private int age;
    private String address;

    public OldZhang() {
    }

    public OldZhang(String name, String sex, int age, String address) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void makeMoney() {
        System.out.println("种地养家");
    }
}  //老张

class LittleZhang extends OldZhang {
    public LittleZhang() {
    }

    public LittleZhang(String name, String sex, int age, String address) {
        super(name, sex, age, address);
    }

    @Override
    public void makeMoney() {
        System.out.println("敲代码养家");
    }
}
