package demo01;

import java.util.ArrayList;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/15 18:25
 **/
public class hw03 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Person> list2 = new ArrayList<>();
        ArrayList<Student> list3 = new ArrayList<>();
        ArrayList<JavaStu> list4 = new ArrayList<>();
        ArrayList<UIStu> list5 = new ArrayList<>();
        ArrayList<Teacher> list6 = new ArrayList<>();
        ArrayList<JavaTeh> list7 = new ArrayList<>();
        ArrayList<UITeh> list8 = new ArrayList<>();

        // 所有都可以调用
//        print1(list1);
//        print1(list2);
//        print1(list3);
//        print1(list4);
//        print1(list5);
//        print1(list6);
//        print1(list7);
//        print1(list8);

        // 要求：参数可以接收任何Person及其子类泛型的ArrayList参数
//        print2(list1);   NO
//        print2(list2);
//        print2(list3);
//        print2(list4);
//        print2(list5);
//        print2(list6);
//        print2(list7);
//        print2(list8);

        // 要求：参数可以接收任何Student及其子类泛型的ArrayList参数
//        print3(list1);   NO
//        print3(list2);   NO
//        print3(list3);
//        print3(list4);
//        print3(list5);
//        print3(list6);   NO
//        print3(list7);   NO
//        print3(list8);   NO

        // 要求：参数可以接收任何Java学员，及其父类泛型的ArrayList参数
//        print4(list1);  NO
//        print4(list2);
//        print4(list3);
//        print4(list4);
//        print4(list5);  NO
//        print4(list6);  NO
//        print4(list7);  NO
//        print4(list8);  NO



    }

    // 要求：参数可以接收任何泛型的ArrayList参数
    public static void print1(ArrayList<?> list) {

    }

    // 要求：参数可以接收任何Person及其子类泛型的ArrayList参数
    public static void print2(ArrayList<? extends Person> list) {

    }

    //要求：参数可以接收任何Student及其子类泛型的ArrayList参数
    public static void print3(ArrayList<? extends Student> list) {

    }

    //要求：参数可以接收任何Java学员，及其父类泛型的ArrayList参数
    public static void print4(ArrayList<? super JavaStu> list) {

    }

}

class Person {

}

class Student extends Person {

}

class JavaStu extends Student {

}

class UIStu extends Student {

}

class Teacher extends Person {

}

class JavaTeh extends Teacher {

}

class UITeh extends Teacher {

}


