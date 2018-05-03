package nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;

public class MoreThanHalf {
    /**
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
     * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
     * 如果不存在则输出0。
     */


    /**
     * 思路：如果有个数频率超过数组长度一半，那么意味着其他所有的数的和都不及数据长度的一半。
     * 选一个count，初始值为1，每当后一个数与前一个不一样便减少1；一样则增加1。
     * 当count==0时，重置新的一个比较数，并把count置1.
     * 如果一个数频率超过了数组长度的一半，那么它一定是最后一次被置1的数。
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array.length == 0 || array == null) return 0;
        int n = array.length / 2;
        int count = 1;
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (count == 0) {
                result = array[i];
                count = 1;
            } else if (result == array[i]) {
                count++;
            } else {
                count--;
            }
        }
        if (!isOverHalf(array, result))
            return 0;

        return result;
    }

    public boolean isOverHalf(int[] a, int result) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (result == a[i]) count++;
        }
        if (count > a.length / 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        MoreThanHalf main = new MoreThanHalf();
        int[] a = {1, 2, 3, 2, 2, 3, 5, 4, 3, 3, 3, 3, 3, 3};
        System.out.println(main.MoreThanHalfNum_Solution(a));
    }
}
