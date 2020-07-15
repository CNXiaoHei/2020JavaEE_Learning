package demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/15 17:21
 **/
public class hw01 {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("JavaEE企业级开发指南");
        col.add("Oracle高级编程");
        col.add("MySQL从入门到精通");
        col.add("Java架构师之路");
        Iterator it = col.iterator();
//        iteratorPrint(it,col);
//        iteratorPrintP(it,col);
//        iteratorPrintPP(it,col);
        removeOracle(col);
    }

    // 使用迭代器遍历所有元素，并打印
    public static void iteratorPrint(Iterator it,Collection<?> col) {
        for (int i = 0; i < col.size(); i++) {
            if (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    // 使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印
    public static void iteratorPrintP(Iterator it,Collection<?> col) {
        for (int i = 0; i < col.size(); i++) {
            if (it.hasNext()) {
                String s = (String) it.next();
                if (s.length()<10) {
                    System.out.println(s.length());
                    System.out.println(s);
                }
            }
        }
    }

    // 使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
    public static void iteratorPrintPP(Iterator it,Collection<?> col) {
        for (int i = 0; i < col.size(); i++) {
            if (it.hasNext()) {
                String s = (String) it.next();
                if (s.contains("Java")) {
                    System.out.println(s);
                }
            }
        }
    }

    // 如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名
    public static void removeOracle(Collection<String> col) {
        col.removeIf(s -> s.contains("Oracle"));
        System.out.println(col);
    }
}
