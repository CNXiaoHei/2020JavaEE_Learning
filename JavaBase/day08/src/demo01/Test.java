package demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/17 15:07
 **/
public class Test {
    public static void main(String[] args) {
        countStr("aaabghn");
    }

    public static void countStr(String s) {
        String[] arr = s.split("");
        HashMap<String,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i],hm.get(arr[i])+1);
            } else {
                hm.put(arr[i],1);
            }

        }
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "出现了" + entry.getValue() + "次");
        }
    }
}
