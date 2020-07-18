package demo01;

import java.util.*;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/17 19:13
 **/
public class hw03 {
    public static void main(String[] args) {
        setUse1();
        setUse2();
        setUse3();
        setUse4();
    }

    public static void setUse1() {
        HashSet<String> sg = new HashSet<>();
        Collections.addAll(sg,"刘备","关羽","张飞","刘备","张飞");
        System.out.println(sg.size());
        Iterator<String> it = sg.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (String s : sg) {
            System.out.println(s);
        }

    }

    public static void setUse2() {
        HashSet<Student> stu = new HashSet<>();
        Student stu1 = new Student("张三","男","20");
        Student stu2 = new Student("李四","女","21");
        Student stu3 = new Student("张三","男","20");
        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);
        for (Student student : stu) {
            System.out.println(student);
        }


    }

    public static void setUse3() {
        LinkedHashSet<Integer> lkhash = new LinkedHashSet<>();
        Collections.addAll(lkhash,20,30,50,10,30,20);
        System.out.println(lkhash.size());
        for (Integer integer : lkhash) {
            if (integer>25) System.out.println(integer);
        }

    }

    public static void setUse4() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Collections.addAll(treeSet, 20, 30, 50, 10, 30, 20);
        System.out.println(treeSet.size());
        for (Integer integer : treeSet) {
            if (integer > 25) System.out.println(integer);
        }
    }

}
