package demo01;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/17 16:57
 **/
public class hw01 {
    public static void main(String[] args) {
        hw1_1();
    }

    public static void hw1_1() {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr,1,2,3,4,5,6,7,8,9,10);
        System.out.println("初始集合：" + arr);
        Collections.shuffle(arr);
        System.out.println("乱序集合：" + arr);
        Collections.sort(arr);
        System.out.println("升序排序集合：" + arr);
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println("降序排序集合：" + arr);
    }
}
