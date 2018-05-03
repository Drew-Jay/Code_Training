package com.dj.Arithmetic;

import java.util.Arrays;

public class MaxMthNum {
    public void getMaxMthNum(int[] a, int low, int high, int m) {
        if (a == null) return;
        //获得某次快排后得到的参考基准的位置
        // （此时不知道基准值的大小是多少，只知道左边的数比它大，右边的数都比它小）
        int temp = partition(a, low, high);

        while (temp != m - 1) {     //如果得到的基准位置刚好等于m-1，意味着这个位置左边的m个数都比它大，该数既为所求。
            if (temp > m - 1) {     //如果得到的基准位置比m-1大，意味着左边的范围包含了所求的这第M大数
                high = temp - 1;    //因此在左边再次查找第M大数，范围是第一个位置，到本次基准位置的左边
                temp = partition(a, low, high);
            } else {                //反之，如果得到的基准位置比m-1小，意味着左边的范围没有包含所求第M大数
                low = temp + 1;     //因此在右边再次查找第M大数，范围是本次基准位置的右边，到最后一个位置
                temp = partition(a, low, high);
            }
        }
    }

    /**
     * 和快排一样，获得的是某次排序的参考基准
     * 采用降序排列，即左边的比基准大，右边的比基准小
     *
     * @param a
     * @param low
     * @param high
     * @return
     */
    public int partition(int[] a, int low, int high) {
        int temp = a[low];
        while (low < high) {
            while (low < high && temp >= a[high])
                high--;
            a[low] = a[high];
            while (low < high && temp <= a[low])
                low++;
            a[high] = a[low];
        }
        a[high] = temp;
        return high;
    }

    public static void main(String[] args) {
        MaxMthNum main = new MaxMthNum();
        int[] a = {9, 7, 5, 3, 1, 6, 8, 4, 2, 10};
        int n = a.length - 1;
        int m = 5;
        System.out.println(Arrays.toString(a));
        main.getMaxMthNum(a, 0, n, m);
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
