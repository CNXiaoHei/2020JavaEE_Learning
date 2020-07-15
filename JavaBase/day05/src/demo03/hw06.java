package demo03;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/12 20:33
 **/
public class hw06 {
    public static void main(String[] args) {
//        sumandAvg();
        stuAvg();
    }
    // 计算它们的总值及平均值
    public static void sumandAvg() {
        double[] arr = {0.1,0.2,2.1,3.2,5.56,7.21};
        BigDecimal sum = new BigDecimal(0.0);
        BigDecimal avg = new BigDecimal(0.0);
        for (int i = 0; i < arr.length; i++) {
            sum = sum.add(new BigDecimal(arr[i] + ""));
        }
        // 当除不尽时采用divide重载方法
        avg = sum.divide(new BigDecimal(arr.length),2, RoundingMode.HALF_UP);
        System.out.println("arr数组的和为：" + sum);
        System.out.println("arr数组的平均数为：" + avg);
    }

    // 创建5个对象，分别存储上述值，并计算5名学员的“平均分”(四舍五入到小数点后2位)。
    public static void stuAvg() {
        Students stu1 = new Students("张三","男","20","79.5");
        Students stu2 = new Students("李四","女","21","80.2");
        Students stu3 = new Students("王五","男","22","77.9");
        Students stu4 = new Students("周六","男","20","55.8");
        Students stu5 = new Students("赵七","女","21","99.9");
        BigDecimal sum = new BigDecimal(0.0);
        sum.add(new BigDecimal(stu1.getGrade()));
        sum.add(new BigDecimal(stu2.getGrade()));
        sum.add(new BigDecimal(stu3.getGrade()));
        sum.add(new BigDecimal(stu4.getGrade()));
        sum.add(new BigDecimal(stu5.getGrade()));
        BigDecimal avg = new BigDecimal(0.0);
        avg = sum.divide(BigDecimal.valueOf(5),2,RoundingMode.HALF_UP);
        System.out.println(sum);
        System.out.println(avg);
    } //还有问题
}

class Students {
    private String name;
    private String sex;
    private String age;
    private String grade;

    public Students() {
    }

    public Students(String name, String sex, String age, String grade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.grade = grade;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
