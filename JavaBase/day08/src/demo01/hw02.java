package demo01;

import com.sun.source.tree.Tree;

import java.util.*;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/17 17:32
 **/
public class hw02 {
    public static void main(String[] args) {
//        hw2_1();
//        hw2_2();
        hw2_3();
    }

    public static void hw2_1() {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"张三");
        hm.put(2,"李四");
        hm.put(1,"王五");
        // 打印集合大小
        System.out.println("集合大小为：" + hm.size());

        // 使用“键找值”的方式遍历集合，打印键和值；
        Set<Integer> keys = hm.keySet();
        for (Integer key : keys) {
            System.out.println("键：" + key + ",值：" + hm.get(key));
        }

        // 使用“键值对”的方式遍历集合，打印键和值；
        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("键：" + entry.getKey() + ",值：" + entry.getValue());
        }
        System.out.println(hm.get(1));
        System.out.println(hm.get(10));
        System.out.println(hm.containsKey(10));
        hm.remove(1);
        System.out.println(hm);

    }

    public static void hw2_2() {
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            }else {
                hm.put(str.charAt(i),1);
            }
        }
        System.out.println(hm);
    }

    public static void hw2_3() {
        //生成一副扑克牌
        TreeMap<Integer,String> tm = new TreeMap<>();
        String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] color = {"♠","♣","♥","♦",};
        int count = 54;
        for (String n : num) {
            for (String c : color) {
                tm.put(--count,n+c);
            }
        }
        tm.put(--count,"小王");
        tm.put(--count,"大王");

        //洗牌
        ArrayList<Integer> cardID = new ArrayList<>();
        Set<Integer> id = tm.keySet();
        for (Integer i : id) {
            cardID.add(i);
        }
        Collections.shuffle(cardID);

        // 发牌
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> last = new ArrayList<>();
        // 一次发三个人，然后i+3
        for (int i = 0; i < 51; i+=3) {
            p1.add(cardID.get(i));
            p2.add(cardID.get(i+1));
            p3.add(cardID.get(i+2));
        }
        // 发底牌
        Collections.addAll(last,cardID.get(51),cardID.get(52),cardID.get(53));
        // 对三个人的手牌排序
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        // showHand
        System.out.println("卢本伟的牌是：");
        for (Integer i : p1) {
            System.out.print(tm.get(i) + " ");
        }
        System.out.println("\n阿姨的牌是：");
        for (Integer i : p2) {
            System.out.print(tm.get(i) + " ");
        }
        System.out.println("\n卡布基诺的牌是：");
        for (Integer i : p3) {
            System.out.print(tm.get(i) + " ");
        }
        System.out.println("\n底牌是：");
        for (Integer i : last) {
            System.out.print(tm.get(i) + " ");
        }
    }
}
