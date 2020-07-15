package demo03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/12 20:10
 **/
public class hw05 {
    public static void main(String[] args) {
//        copyArr();
//        moveArr();
        cycleTime();
    }

    // 复制数组
    public static void copyArr() {
        int[] arr = {10,27,8,5,2,1,3,55,88};
        int[] newArr = new int[5];
        System.arraycopy(arr,2,newArr,0,5);
        System.out.println(Arrays.toString(newArr));
    }

    // 在数组中插入数据
    public static void moveArr() {
        int[] arr = {55,77,0,88,22,44,33};
        int temp = arr[2];
        System.arraycopy(arr,3,arr,2,4);
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }

    // 向集合中添加1千万个数字，请计算这个循环运行的时间，并打印
    public static void cycleTime() {
        ArrayList<Integer> List;
        List = new ArrayList<>();
        Random rd = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            List.add(rd.nextInt(1000));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("循环运行时间为：" + (endTime-startTime) + "毫秒");
    }
}
