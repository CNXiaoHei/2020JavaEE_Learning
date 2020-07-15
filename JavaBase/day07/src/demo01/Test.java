package demo01;

import java.util.ArrayList;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/15 13:33
 **/
public class Test {
    public static void main(String[] args) {
//        System.out.println(Solution.reverse(1534236469));
        System.out.println(Solution.isPalindrome(121));
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static int reverse(int x) {
        int[] num = new int[32];
        int i;
        long result = 0;
        if (x<0) {
            x = Math.abs(x);
            for (i = 0; x>9; i++) {
                num[i] = (x%10);
                x/=10;
            }
            num[i] = x;
            int len = i;
            for (int j = 0; j <= len; j++) {
                result += num[i--]*Math.pow(10,j);
            }
            result *= -1;
        } else {
            for (i = 0; x>9; i++) {
                num[i] = (x%10);
                x/=10;
            }
            num[i] = x;
            int len = i;
            for (int j = 0; j <= len; j++) {
                result += num[i--]*Math.pow(10,j);
            }
        }
        if (result>=-1*Math.pow(2,31)&&result<Math.pow(2,31)) {
            return (int) result;
        } else {
            return 0;
        }
    }

    public static boolean isPalindrome(int x) {
        int top;  // 头部数字
        int last; // 尾部数字
        ArrayList<Integer> arr = new ArrayList<>(); // 存放数字
        if (x>0) {
            // 采取头尾比对头尾相等
            for (int i = 0;x>9;i++) {
                arr.add(x%10);
                x /= 10;
            }
            arr.add(x);
            int num = arr.size();
            if (arr.size()==1) {
                return true;
            }
            for (int j = 0; j < arr.size()/2; j++) {
                if (arr.get(j)==arr.get(--num)) {
                    continue;
                }else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }

    }
}
