package demo03;

import java.util.Arrays;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/12 23:15
 **/
public class hw7 {
    public static void main(String[] args) {
        printArr();
    }

    public static void printArr() {
        int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
