package Demo02;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/10 17:01
 **/
public class Test {
    public static void main(String[] args) {
        JavaTeacher jj = new JavaTeacher();
        UITeacher uu = new UITeacher();

        jj.work();
        uu.work();
        uu.paint();
    }
}

class JavaTeacher extends Employee {
    @Override
    void work() {
        System.out.println("正在进行JAVA教学");
    }
}

class UITeacher extends Employee implements Paint {
    @Override
    void work() {
        System.out.println("正在进行UI教学");
    }

    @Override
    public void paint() {
        System.out.println("画画");
    }
}