package demo01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/15 18:07
 **/
public class hw02 {
    public static void main(String[] args) {
        Collection<Double> col = new ArrayList<>();
        col.add(88.5);
        col.add(39.2);
        col.add(77.1);
        col.add(56.8);
        col.add(89.0);
        col.add(99.0);
        col.add(59.5);
        forPlus(col);
        forPlusP(col);
        forPlusPP(col);
        forPlusPPP(col);
    }

    // 使用增强for遍历所有元素，并打印
    public static void forPlus(Collection<Double> col) {
        for (Double coll : col) {
            System.out.println(coll);
        }
    }

    // 使用增强for遍历所有元素，打印不及格的分数
    public static void forPlusP(Collection<Double> col) {
        for (Double coll : col) {
            if (coll>=60) {
                System.out.println(coll);
            }
        }
    }

    // 使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果
    public static void forPlusPP(Collection<Double> col) {
        int notPass = 0;
        int sum = 0;
        BigDecimal avg;
        for (Double coll : col) {
            if (coll<60) {
                ++notPass;
                sum += coll;
            }
        }
        BigDecimal Sum = new BigDecimal(sum);
        BigDecimal nP = new BigDecimal(notPass);
        avg = Sum.divide(nP,2, RoundingMode.HALF_UP);
        System.out.println(avg);
    }

    // 使用增强for遍历所有元素，求出最高分，并打印
    public static void forPlusPPP(Collection<Double> col) {
        Double max = 0.0;
        for (Double coll : col) {
            if (max<coll) {
                max = coll;
            }
        }
        System.out.println("最高分为：" + max);
    }
}
