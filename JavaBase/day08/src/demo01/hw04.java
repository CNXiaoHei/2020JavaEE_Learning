package demo01;

import java.util.*;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/17 19:55
 **/
public class hw04 {
    public static void main(String[] args) {
        setPlus1();
        setPlus2();
    }

    public static void setPlus1() {
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr,"a","f","b","c","a","d");
        HashSet<String> hs = new HashSet<>();
        for (String a : arr) {
            hs.add(a);
        }
        System.out.println(hs);
    }

    public static void setPlus2() {
        Random rd = new Random();
        TreeSet<Integer> ts1 = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();
        while (ts1.size()<6) {
            ts1.add(rd.nextInt(33)+1);
        }
        ts2.add(rd.nextInt(16)+1);
        for (Integer integer : ts1) {
            System.out.print(integer + " ");
        }
        for (Integer integer : ts2) {
            System.out.println(integer);
        }
    }
}
