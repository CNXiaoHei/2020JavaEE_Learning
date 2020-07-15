package Demo04;

/**
 * @Author: zhangyongliang
 * @Date: 2020/7/14 15:33
 **/
public class Test {
    public static void main(String[] args) {
        int[] A = {1,3,5,7,0,0,0,1,3,5,7,1,3,5,7,9};
        System.out.println(singleNumber(A));
    }

    public static int singleNumber(int[] A) {
        int ones = 0;//记录只出现过1次的bits
        int twos = 0;//记录只出现过2次的bits
        int threes;
        for(int i = 0; i < A.length; i++){
            int t = A[i];
            twos |= ones&t;//要在更新ones前面更新twos
            ones ^= t;
            threes = ones&twos;//ones和twos中都为1即出现了3次
            ones &= ~threes;//抹去出现了3次的bits
            twos &= ~threes;
        }
        return ones;
    }
}
